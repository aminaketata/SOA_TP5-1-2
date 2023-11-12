package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte
{
    double code,solde;
    @XmlTransient
    Date dateCreation;
    public Compte(double code,double solde,Date dateCreation)
    {
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    public Compte()
    {
    }
    public void setCode(double code)
    {
        this.code=code;
    }
    public void setSolde(double solde)
    {
        this.solde=solde;
    }
    public void setDateCreation(Date dateCreation)
    {
        this.dateCreation=dateCreation;
    }
    public double getCode()
    {
        return code;
    }
    public double getSolde()
    {
        return solde;
    }
    public Date getDateCreation()
    {
        return dateCreation;
    }
}
