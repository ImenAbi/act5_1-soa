package service;
	
	

    import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

    @WebService
    public class BanqueService {

        @WebMethod
        public double conversion(@WebParam(name = "montant") double montant,
                                 @WebParam(name = "taux") double taux) {
            // Implémentation de la conversion
            return montant * taux;
        }

        @WebMethod
        public List<Compte> getComptes() {
            // Implémentation pour récupérer la liste des comptes
            // (Vous pouvez remplacer cette implémentation par la logique réelle)
            return null;
        }
    


}
