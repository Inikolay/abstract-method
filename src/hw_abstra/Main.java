package hw_abstra;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add(new Individual());
        clients.add(new LegalEntities());
        clients.add(new IndividualEntrepreneur());

        for (Client allClients : clients){
            allClients.individualSum();
        }

    }
}
