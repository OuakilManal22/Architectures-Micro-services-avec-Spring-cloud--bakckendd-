# Architectures-Micro-services-avec-Spring-cloud-bakckend-

Spring Cloud Gateway et Eureka Discovery sont deux composants essentiels de l'écosystème Spring Cloud, conçu pour simplifier le développement d'applications basées sur des microservices. 
Spring Cloud Gateway est une passerelle (ou gateway) API complète, extensible et conviviale pour la construction de passerelles d'API. Il permet de router et de filtrer les requêtes HTTP entrantes dans l'architecture de microservices. 
Eureka est un serveur de découverte et d'enregistrement de services fourni par Spring Cloud. Il permet aux services de s'enregistrer et de découvrir d'autres services dans une architecture de microservices distribuée.
Durant cette activité pratique, nous aurons l'architecture suivante:

![image](https://github.com/OuakilManal22/Architectures-Micro-services-avec-Spring-cloud--bakckendd-/assets/105586177/a0637cd3-c2b7-497e-82c0-a03d38551997)

Ce projet suit une architecture de microservices avec des composants spécifiques pour gérer les données, la passerelle, l'annuaire, la communication entre microservices et l'interface utilisateur.

- Création de la passerelle (Gateway) avec Spring Cloud Gateway : pour gérer le routage vers Customer-service et Inventory-service.
![image](https://github.com/OuakilManal22/Architectures-Micro-services-avec-Spring-cloud--bakckendd-/assets/105586177/24e01d67-4a7d-4982-9a8c-cf3c891ca11b)

Création de l'annuaire (Registry) avec Eureka Server : pour que les microservices s'enregistrent et se découvrent mutuellement.
![image](https://github.com/OuakilManal22/Architectures-Micro-services-avec-Spring-cloud--bakckendd-/assets/105586177/8cd6b5b2-be10-41fe-b8d1-9e446625ed4b)


Accès aux données à travers la gateways via le chemin: http://localhost:8888/customers/1

![image](https://github.com/OuakilManal22/Architectures-Micro-services-avec-Spring-cloud--bakckendd-/assets/105586177/5857cfce-8666-4fab-8fe3-578249a5f664)

Lorsque Spring Cloud Gateway et Eureka Discovery sont utilisés ensemble, nous disposons d'une combinaison puissante pour la construction et la gestion d'applications basées sur des microservices. Spring Cloud Gateway offre le routage, le filtrage et la sécurité, tandis qu'Eureka simplifie la découverte de services et l'équilibrage de charge, permettant une architecture de microservices flexible et évolutive.
