package com.cis.paseaproduccionweb.beans;
// Generated 16/06/2015 10:46:39 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * PpModulos generated by hbm2java
 */
public class PpModulos  implements java.io.Serializable {


     private BigDecimal moduloId;
     private String nombreModulo;
     private String flagUso;
     private String descModulo;
     private String flagEstado;
     private BigDecimal ppsistemaSistemaId;
     private BigDecimal ppusuarioUsuarioId;

    public PpModulos() {
    }

	
    public PpModulos(BigDecimal moduloId, BigDecimal ppsistemaSistemaId) {
        this.moduloId = moduloId;
        this.ppsistemaSistemaId = ppsistemaSistemaId;
    }
    public PpModulos(BigDecimal moduloId, String nombreModulo, String flagUso, String descModulo, String flagEstado, BigDecimal ppsistemaSistemaId, BigDecimal ppusuarioUsuarioId) {
       this.moduloId = moduloId;
       this.nombreModulo = nombreModulo;
       this.flagUso = flagUso;
       this.descModulo = descModulo;
       this.flagEstado = flagEstado;
       this.ppsistemaSistemaId = ppsistemaSistemaId;
       this.ppusuarioUsuarioId = ppusuarioUsuarioId;
    }
   
    public BigDecimal getModuloId() {
        return this.moduloId;
    }
    
    public void setModuloId(BigDecimal moduloId) {
        this.moduloId = moduloId;
    }
    public String getNombreModulo() {
        return this.nombreModulo;
    }
    
    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }
    public String getFlagUso() {
        return this.flagUso;
    }
    
    public void setFlagUso(String flagUso) {
        this.flagUso = flagUso;
    }
    public String getDescModulo() {
        return this.descModulo;
    }
    
    public void setDescModulo(String descModulo) {
        this.descModulo = descModulo;
    }
    public String getFlagEstado() {
        return this.flagEstado;
    }
    
    public void setFlagEstado(String flagEstado) {
        this.flagEstado = flagEstado;
    }
    public BigDecimal getPpsistemaSistemaId() {
        return this.ppsistemaSistemaId;
    }
    
    public void setPpsistemaSistemaId(BigDecimal ppsistemaSistemaId) {
        this.ppsistemaSistemaId = ppsistemaSistemaId;
    }
    public BigDecimal getPpusuarioUsuarioId() {
        return this.ppusuarioUsuarioId;
    }
    
    public void setPpusuarioUsuarioId(BigDecimal ppusuarioUsuarioId) {
        this.ppusuarioUsuarioId = ppusuarioUsuarioId;
    }




}


