package com.cis.paseaproduccionweb.beans;
// Generated 16/06/2015 10:46:39 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * PpSubmenus generated by hbm2java
 */
public class PpSubmenus  implements java.io.Serializable {


     private BigDecimal submenuId;
     private String descSubmenu;
     private String flagUso;
     private String flagEstado;
     private String nombreSubmenu;
     private BigDecimal moduloModuloId;
     private BigDecimal ppusuarioUsuarioId;

    public PpSubmenus() {
    }

	
    public PpSubmenus(BigDecimal submenuId, BigDecimal moduloModuloId) {
        this.submenuId = submenuId;
        this.moduloModuloId = moduloModuloId;
    }
    public PpSubmenus(BigDecimal submenuId, String descSubmenu, String flagUso, String flagEstado, String nombreSubmenu, BigDecimal moduloModuloId, BigDecimal ppusuarioUsuarioId) {
       this.submenuId = submenuId;
       this.descSubmenu = descSubmenu;
       this.flagUso = flagUso;
       this.flagEstado = flagEstado;
       this.nombreSubmenu = nombreSubmenu;
       this.moduloModuloId = moduloModuloId;
       this.ppusuarioUsuarioId = ppusuarioUsuarioId;
    }
   
    public BigDecimal getSubmenuId() {
        return this.submenuId;
    }
    
    public void setSubmenuId(BigDecimal submenuId) {
        this.submenuId = submenuId;
    }
    public String getDescSubmenu() {
        return this.descSubmenu;
    }
    
    public void setDescSubmenu(String descSubmenu) {
        this.descSubmenu = descSubmenu;
    }
    public String getFlagUso() {
        return this.flagUso;
    }
    
    public void setFlagUso(String flagUso) {
        this.flagUso = flagUso;
    }
    public String getFlagEstado() {
        return this.flagEstado;
    }
    
    public void setFlagEstado(String flagEstado) {
        this.flagEstado = flagEstado;
    }
    public String getNombreSubmenu() {
        return this.nombreSubmenu;
    }
    
    public void setNombreSubmenu(String nombreSubmenu) {
        this.nombreSubmenu = nombreSubmenu;
    }
    public BigDecimal getModuloModuloId() {
        return this.moduloModuloId;
    }
    
    public void setModuloModuloId(BigDecimal moduloModuloId) {
        this.moduloModuloId = moduloModuloId;
    }
    public BigDecimal getPpusuarioUsuarioId() {
        return this.ppusuarioUsuarioId;
    }
    
    public void setPpusuarioUsuarioId(BigDecimal ppusuarioUsuarioId) {
        this.ppusuarioUsuarioId = ppusuarioUsuarioId;
    }




}


