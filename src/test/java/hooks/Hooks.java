package hooks;

import io.cucumber.java.Before;

import static base_urls.MedunnaBaseUrl.setUp;

public class Hooks {



        @Before("@api")   //@Before("@api") dersek api tagi olnalar calisir Parantez ici bos birakilirsa tum proje icindeki senaryo icin calisir
        public void beforeApi(){
            setUp();
        }
    }

