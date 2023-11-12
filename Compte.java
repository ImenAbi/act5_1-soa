package metier;
import java.util.Date;

public class Compte {
	
	
	




	        private String code;
	        private double solde;
	        private Date dateCreation;

	        // Constructeur sans paramètres
	        public Compte() {
	        }

	        // Constructeur avec paramètres
	        public Compte(String code, double solde, Date dateCreation) {
	            this.code = code;
	            this.solde = solde;
	            this.dateCreation = dateCreation;
	        }

	        // Getters and setters
	        public String getCode() {
	            return code;
	        }

	        public void setCode(String code) {
	            this.code = code;
	        }

	        public double getSolde() {
	            return solde;
	        }

	        public void setSolde(double solde) {
	            this.solde = solde;
	        }

	        public Date getDateCreation() {
	            return dateCreation;
	        }

	        public void setDateCreation(Date dateCreation) {
	            this.dateCreation = dateCreation;
	        }
	


}
