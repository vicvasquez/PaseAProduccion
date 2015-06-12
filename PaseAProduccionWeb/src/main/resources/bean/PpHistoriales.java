package bean;
// Generated 12/06/2015 01:08:34 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

/**
 * PpHistoriales generated by hbm2java
 */
public class PpHistoriales  implements java.io.Serializable {


     private BigDecimal historialId;
     private String version;
     private BigDecimal aprobadorId;
     private Blob archivo;
     private Date fecha;
     private BigDecimal moduloModuloId;
     private BigDecimal ppsubmenuSubmenuId;
     private BigDecimal ppformFormularioId;

    public PpHistoriales() {
    }

	
    public PpHistoriales(BigDecimal historialId) {
        this.historialId = historialId;
    }
    public PpHistoriales(BigDecimal historialId, BigDecimal aprobadorId, Blob archivo, Date fecha, BigDecimal moduloModuloId, BigDecimal ppsubmenuSubmenuId, BigDecimal ppformFormularioId) {
       this.historialId = historialId;
       this.aprobadorId = aprobadorId;
       this.archivo = archivo;
       this.fecha = fecha;
       this.moduloModuloId = moduloModuloId;
       this.ppsubmenuSubmenuId = ppsubmenuSubmenuId;
       this.ppformFormularioId = ppformFormularioId;
    }
   
    public BigDecimal getHistorialId() {
        return this.historialId;
    }
    
    public void setHistorialId(BigDecimal historialId) {
        this.historialId = historialId;
    }
    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    public BigDecimal getAprobadorId() {
        return this.aprobadorId;
    }
    
    public void setAprobadorId(BigDecimal aprobadorId) {
        this.aprobadorId = aprobadorId;
    }
    public Blob getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(Blob archivo) {
        this.archivo = archivo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getModuloModuloId() {
        return this.moduloModuloId;
    }
    
    public void setModuloModuloId(BigDecimal moduloModuloId) {
        this.moduloModuloId = moduloModuloId;
    }
    public BigDecimal getPpsubmenuSubmenuId() {
        return this.ppsubmenuSubmenuId;
    }
    
    public void setPpsubmenuSubmenuId(BigDecimal ppsubmenuSubmenuId) {
        this.ppsubmenuSubmenuId = ppsubmenuSubmenuId;
    }
    public BigDecimal getPpformFormularioId() {
        return this.ppformFormularioId;
    }
    
    public void setPpformFormularioId(BigDecimal ppformFormularioId) {
        this.ppformFormularioId = ppformFormularioId;
    }




}


