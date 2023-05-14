package tn.esprit.microservice.domain.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.microservice.domain.dtos.FactureFournisseurDTO;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class FactureFournisseur extends Facture implements Serializable {
    @Builder
    public FactureFournisseur(Long id, String code, String description, Date dateFacture, Date datePayement, int nombreArticle, double prixTotal) {
        super(id, code, description, dateFacture, datePayement, nombreArticle, prixTotal);
    }



    public FactureFournisseurDTO toDto(){
        return FactureFournisseurDTO.builder().code(getCode()).description(getDescription())
                .dateFacture(getDateFacture()).datePayement(getDatePayement())
                .nombreArticle(getNombreArticle())
                .prixTotal(getPrixTotal())
                .build();
    }
}
