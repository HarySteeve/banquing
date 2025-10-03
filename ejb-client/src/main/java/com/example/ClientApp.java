package com.example;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Properties;

import com.example.dto.CreditDTO; 

public class ClientApp {
    public static void main(String[] args) throws NamingException {

        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080"); // Port WildFly par défaut

        Context context = new InitialContext(props);

        // JNDI du UserBean 
        String jndiName = "ejb-ear-banquing-1.0-SNAPSHOT/com.example-ejb-impl-1.0-SNAPSHOT/CreditBean!com.example.CreditRemote";

        CreditRemote creditBean = (CreditRemote) context.lookup(jndiName);

        // Récupérer tous les credits du compte id: 1
        List<CreditDTO> credits = creditBean.getAllcreditsByIdCompte(100);
        for(CreditDTO c : credits){
            System.out.println("Montant: " + c.getMontant() +", desc: "+ c.getDescription());
        }
    }
}
