package com.pfe.model;

import java.text.DateFormat;
import java.util.Date;

/**
 * DetailEffet generated by hbm2java
 */
public class DetailEffet implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public String numEff;
	private Date datOpe;
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numSeq ;// pour lannulation
	private Long codVal;// 40/41
	private Long codEnrg;// 21/22
	private String codEtat;// I//A/V
	private boolean checked;// transiant
	public Long mntEff;
	public String ribTir;
	public ContratCpt contratCpt;// benificiaire
	private String nomTir;
	private Long numPres;// 1/2/....
	public Date datEch;
	private Date datDeliv;// date delivrance impaye
	private Date datRec;// //date reclamation trezor
	private Date datCre;
	private String adrTir;
	public MotifRejet motifRejet;
	private GlobalRemise globalRemise;
	static DateFormat dateFormat;
	
	public DetailEffet() {
		super();
	}

	public String getNumEff() {
		return numEff;
	}

	public void setNumEff(String numEff) {
		this.numEff = numEff;
	}

	public Date getDatOpe() {
		return datOpe;
	}

	public void setDatOpe(Date datOpe) {
		this.datOpe = datOpe;
	}

	public Long getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(Long numSeq) {
		this.numSeq = numSeq;
	}

	public Long getCodVal() {
		return codVal;
	}

	public void setCodVal(Long codVal) {
		this.codVal = codVal;
	}

	public Long getCodEnrg() {
		return codEnrg;
	}

	public void setCodEnrg(Long codEnrg) {
		this.codEnrg = codEnrg;
	}

	public String getCodEtat() {
		return codEtat;
	}

	public void setCodEtat(String codEtat) {
		this.codEtat = codEtat;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Long getMntEff() {
		return mntEff;
	}

	public void setMntEff(Long mntEff) {
		this.mntEff = mntEff;
	}

	public String getRibTir() {
		return ribTir;
	}

	public void setRibTir(String ribTir) {
		this.ribTir = ribTir;
	}

	public ContratCpt getcontratCpt() {
		return contratCpt;
	}

	public void setcontratCpt(ContratCpt contratCpt) {
		this.contratCpt = contratCpt;
	}

	public String getNomTir() {
		return nomTir;
	}

	public void setNomTir(String nomTir) {
		this.nomTir = nomTir;
	}

	public Long getNumPres() {
		return numPres;
	}

	public void setNumPres(Long numPres) {
		this.numPres = numPres;
	}

	public Date getDatEch() {
		return datEch;
	}

	public void setDatEch(Date datEch) {
		this.datEch = datEch;
	}

	public Date getDatDeliv() {
		return datDeliv;
	}

	public void setDatDeliv(Date datDeliv) {
		this.datDeliv = datDeliv;
	}

	public Date getDatRec() {
		return datRec;
	}

	public void setDatRec(Date datRec) {
		this.datRec = datRec;
	}

	public Date getDatCre() {
		return datCre;
	}

	public void setDatCre(Date datCre) {
		this.datCre = datCre;
	}

	public String getAdrTir() {
		return adrTir;
	}

	public void setAdrTir(String adrTir) {
		this.adrTir = adrTir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ContratCpt getContratCpt() {
		return contratCpt;
	}

	public void setContratCpt(ContratCpt contratCpt) {
		this.contratCpt = contratCpt;
	}

	public MotifRejet getMotifRejet() {
		return motifRejet;
	}

	public void setMotifRejet(MotifRejet motifRejet) {
		this.motifRejet = motifRejet;
	}

	public GlobalRemise getGlobalRemise() {
		return globalRemise;
	}

	public void setGlobalRemise(GlobalRemise globalRemise) {
		this.globalRemise = globalRemise;
	}

}
