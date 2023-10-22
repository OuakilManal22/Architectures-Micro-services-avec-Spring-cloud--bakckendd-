package com.example.billingservice;

import com.example.billingservice.entities.Bill;
import com.example.billingservice.entities.ProductItem;
import com.example.billingservice.feign.CustomerRestClient;
import com.example.billingservice.feign.ProductItemRestClient;
import com.example.billingservice.model.Customer;
import com.example.billingservice.model.Product;
import com.example.billingservice.repositories.BillRepository;
import com.example.billingservice.repositories.ProductItemRepository;
import org.bouncycastle.asn1.cmp.Challenge;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository, CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient)
    {
     return args ->
     {
         Customer customer= customerRestClient.getCustomerById(1L);
         Bill bill = billRepository.save(new Bill(null, new Date(),null, customer.getId(), null));
         //FILLING DATABASE FROM ANOTHER MICROSERVICE
         PagedModel<Product> productPagedModel = productItemRestClient.pageProducts();
         productPagedModel.forEach(product -> {
             ProductItem productItem = new ProductItem();
             productItem.setPrice(product.getPrice());
             productItem.setQuantity(1+new Random().nextInt(100));
             productItem.setId(product.getId());
             productItem.setBill(bill);
             productItemRepository.save(productItem);

         });

     };
    }

}
