# imane-loukili-enset-adria-test

1. Création des micro-services :
   1. wallet-service
      ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/6628a9dc-9a3c-4bb9-af27-9255b5caa8ce)
   2. transfer-service
      ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/5f33d392-460a-4c71-aab5-7c3c0485a4d2)
   3. gateway service
      ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/fb9b6205-5668-4b5e-a2da-dcace05a354f)
   4. discovery-service
      ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/ebd760ee-48d8-489b-acb7-58cb13d8f677)
   5. config-service
      ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/2c4d63e1-e077-43ec-a23f-2cd1b86c09e5)

3. Développer et tester les micro-services discovery-service et gateway-service et config-service
   #discovery-service
   ```
   server.port=8761
   eureka.client.fetch-registry=false
   eureka.client.register-with-eureka=false
   ```
   ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/fd5c3e89-8d04-4782-99db-9f6879472f6e)
   #gateway-service
   ```
   server.port=8888
   spring.application.name=gateway-service
   spring.cloud.discovery.enabled=true
    ```
   #config-service
   ```
   server.port=9999
   spring.application.name=config-service
   spring.cloud.discovery.enabled=true
   spring.cloud.config.server.git.uri=
   
   ```
   ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/f64e7ab7-5271-4901-aa65-28632a394edc)

   ![image](https://github.com/loukili-imane/imane-loukili-enset-adria-test/assets/93887037/1ff4afd9-1ee8-43f8-a1fc-77f3bbcf2391)

5. Développer et tester le micro-service wallet-service
   #entités :
```
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "client")
    private List<Wallet> wallets;
}
```
```
@Entity
@Data  @NoArgsConstructor  @AllArgsConstructor  @ToString
public class Wallet {
    @Id @GeneratedValue
    private UUID id;
    private double solde;
    private Date dateCréation;
    private String devise;
    @ManyToOne
    private Client client;
}
```
6. Développer et tester le micro-service transfer-service 
7. Développer un simple frontend web pour l’application 
