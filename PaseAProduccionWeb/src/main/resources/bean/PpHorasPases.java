package bean;
// Generated 12/06/2015 01:08:34 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * PpHorasPases generated by hbm2java
 */
public class PpHorasPases  implements java.io.Serializable {


     private long horapaseId;
     private Date horaInicio;
     private Date horaFin;
     private String horapaseDia;
     private BigDecimal horapaseHorapaseId;
     private BigDecimal entornoEntornoId;

    public PpHorasPases() {
    }

	
    public PpHorasPases(long horapaseId, BigDecimal entornoEntornoId) {
        this.horapaseId = horapaseId;
        this.entornoEntornoId = entornoEntornoId;
    }
    public PpHorasPases(long horapaseId, Date horaInicio, Date horaFin, String horapaseDia, BigDecimal horapaseHorapaseId, BigDecimal entornoEntornoId) {
       this.horapaseId = horapaseId;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.horapaseDia = horapaseDia;
       this.horapaseHorapaseId = horapaseHorapaseId;
       this.entornoEntornoId = entornoEntornoId;
    }
   
    public long getHorapaseId() {
        return this.horapaseId;
    }
    
    public void setHorapaseId(long horapaseId) {
        this.horapaseId = horapaseId;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public String getHorapaseDia() {
        return this.horapaseDia;
    }
    
    public void setHorapaseDia(String horapaseDia) {
        this.horapaseDia = horapaseDia;
    }
    public BigDecimal getHorapaseHorapaseId() {
        return this.horapaseHorapaseId;
    }
    
    public void setHorapaseHorapaseId(BigDecimal horapaseHorapaseId) {
        this.horapaseHorapaseId = horapaseHorapaseId;
    }
    public BigDecimal getEntornoEntornoId() {
        return this.entornoEntornoId;
    }
    
    public void setEntornoEntornoId(BigDecimal entornoEntornoId) {
        this.entornoEntornoId = entornoEntornoId;
    }




}

