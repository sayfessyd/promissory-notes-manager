package com.pfe.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ContratCpt generated by MyEclipse - Hibernate Tools
 */
public class ContratCpt implements java.io.Serializable, Cloneable, Comparable<ContratCpt> {

	// Fields
	private static final long serialVersionUID = 1L;
	public ContratCptId contratCptId;
	private Personne personne;
	private Devise devise;
	private Structure structure;
	private Produit produit;
	private Date datOuvCcpt;
	private String codEtatCcpt;
	private Long montSoldCcpt;
	private Date datBlocCcpt;
	private Date datDeblCcpt;
	private Date datCloCcpt;
	private Date datCtxCcpt;
	private String nomIntiCcpt;
	private Adresse adresseCorresp;
	private Long montBlocCcpt;
	private Long montAutCcpt;
	private Long montSdevCcpt;
	private Date datEautCcpt;
	private Long montBdevCcpt;
	private Long provision;// transiant
	private Set<DetailEffet> effets = new HashSet<DetailEffet>(0);
	// Constructors

	/** default constructor */
	public ContratCpt() {
	}

	/** minimal constructor */
	public ContratCpt(ContratCptId id, Devise devise, Structure structure,
			Produit produit, Date datOuvCcpt, String codEtatCcpt) {
		this.contratCptId = id;
		this.devise = devise;
		this.structure = structure;
		this.produit = produit;
		this.datOuvCcpt = datOuvCcpt;
		this.codEtatCcpt = codEtatCcpt;
	}

	public ContratCpt(ContratCptId contratCptId, Personne personne,
			Devise devise, Structure structure, Produit produit,
			Date datOuvCcpt, String codEtatCcpt, Long montSoldCcpt,
			Date datBlocCcpt, Date datDeblCcpt, Date datCloCcpt,
			Date datCtxCcpt, Date datTranCcpt, String nomIntiCcpt,
			Adresse adresseCorresp, Long montBlocCcpt, Long montAutCcpt,
			Long montAutCcptFinEcheance, Long montSdevCcpt, Date datEautCcpt,
			Long montBdevCcpt, Long provision) {
		super();
		this.contratCptId = contratCptId;
		this.personne = personne;
		this.devise = devise;
		this.structure = structure;
		this.produit = produit;
		this.datOuvCcpt = datOuvCcpt;
		this.codEtatCcpt = codEtatCcpt;
		this.montSoldCcpt = montSoldCcpt;
		this.datBlocCcpt = datBlocCcpt;
		this.datDeblCcpt = datDeblCcpt;
		this.datCloCcpt = datCloCcpt;
		this.datCtxCcpt = datCtxCcpt;
		this.nomIntiCcpt = nomIntiCcpt;
		this.adresseCorresp = adresseCorresp;
		this.montBlocCcpt = montBlocCcpt;
		this.montAutCcpt = montAutCcpt;
		this.montSdevCcpt = montSdevCcpt;
		this.datEautCcpt = datEautCcpt;
		this.montBdevCcpt = montBdevCcpt;
		this.provision = provision;
	}
	
	@Override
	public int compareTo(ContratCpt cpt) {
	    return cpt.getContratCptId().compareTo(this.getContratCptId());
	}

	public void setProvision(Long provision) {
		this.provision = provision;
	}

	public Long getProvision(Date dateComptable) {
		if (this.montBlocCcpt == null)
			this.montBlocCcpt = 0L;
		if (this.montAutCcpt == null)
			this.montAutCcpt = 0L;
		if ((this.datEautCcpt != null)
				&& (dateComptable.before(this.datEautCcpt) || dateComptable
						.equals(this.datEautCcpt))) {
			this.provision = this.montSoldCcpt + this.montAutCcpt
					- this.montBlocCcpt;
		} else {
			this.provision = this.montSoldCcpt - this.montBlocCcpt;
		}
		return this.provision;
	}

	@Override
	public String toString() {
		return contratCptId.getCompteClient();
	}

	public ContratCptId getContratCptId() {
		return contratCptId;
	}

	public void setContratCptId(ContratCptId contratCptId) {
		this.contratCptId = contratCptId;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Devise getDevise() {
		return devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Date getDatOuvCcpt() {
		return datOuvCcpt;
	}

	public void setDatOuvCcpt(Date datOuvCcpt) {
		this.datOuvCcpt = datOuvCcpt;
	}

	public String getCodEtatCcpt() {
		return codEtatCcpt;
	}

	public void setCodEtatCcpt(String codEtatCcpt) {
		this.codEtatCcpt = codEtatCcpt;
	}

	public Long getMontSoldCcpt() {
		return montSoldCcpt;
	}

	public void setMontSoldCcpt(Long montSoldCcpt) {
		this.montSoldCcpt = montSoldCcpt;
	}

	public Date getDatBlocCcpt() {
		return datBlocCcpt;
	}

	public void setDatBlocCcpt(Date datBlocCcpt) {
		this.datBlocCcpt = datBlocCcpt;
	}

	public Date getDatDeblCcpt() {
		return datDeblCcpt;
	}

	public void setDatDeblCcpt(Date datDeblCcpt) {
		this.datDeblCcpt = datDeblCcpt;
	}

	public Date getDatCloCcpt() {
		return datCloCcpt;
	}

	public void setDatCloCcpt(Date datCloCcpt) {
		this.datCloCcpt = datCloCcpt;
	}

	public Date getDatCtxCcpt() {
		return datCtxCcpt;
	}

	public void setDatCtxCcpt(Date datCtxCcpt) {
		this.datCtxCcpt = datCtxCcpt;
	}

	public String getNomIntiCcpt() {
		return nomIntiCcpt;
	}

	public void setNomIntiCcpt(String nomIntiCcpt) {
		this.nomIntiCcpt = nomIntiCcpt;
	}

	public Adresse getAdresseCorresp() {
		return adresseCorresp;
	}

	public void setAdresseCorresp(Adresse adresseCorresp) {
		this.adresseCorresp = adresseCorresp;
	}

	public Long getMontBlocCcpt() {
		return montBlocCcpt;
	}

	public void setMontBlocCcpt(Long montBlocCcpt) {
		this.montBlocCcpt = montBlocCcpt;
	}

	public Long getMontAutCcpt() {
		return montAutCcpt;
	}

	public void setMontAutCcpt(Long montAutCcpt) {
		this.montAutCcpt = montAutCcpt;
	}

	public Long getMontSdevCcpt() {
		return montSdevCcpt;
	}

	public void setMontSdevCcpt(Long montSdevCcpt) {
		this.montSdevCcpt = montSdevCcpt;
	}

	public Date getDatEautCcpt() {
		return datEautCcpt;
	}

	public void setDatEautCcpt(Date datEautCcpt) {
		this.datEautCcpt = datEautCcpt;
	}

	public Long getMontBdevCcpt() {
		return montBdevCcpt;
	}

	public void setMontBdevCcpt(Long montBdevCcpt) {
		this.montBdevCcpt = montBdevCcpt;
	}

	public Long getProvision() {
		return provision;
	}

	public Set<DetailEffet> getEffets() {
		return effets;
	}

	public void setEffets(Set<DetailEffet> effets) {
		this.effets = effets;
	}

}
