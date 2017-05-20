/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Usuario {
    
    /* 
    NombreUsuario	string
    Universidad	string
    Carrera	string
    Fec_registro	date
    Fec_visita	date
    PuntajeUsuario	entero
    PopulUsuario	entero */
    
    private String IdUsuario;
    private String claveUsuario;
    private String nombreUsuario;
    private String Universidad;
    private String Carrera;
    private Date Fec_registro;
    private Date Fec_visita;
    private int PuntajeUsuario;
    private int PopulUsuario;

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public Date getFec_registro() {
        return Fec_registro;
    }

    public void setFec_registro(Date Fec_registro) {
        this.Fec_registro = Fec_registro;
    }

    public Date getFec_visita() {
        return Fec_visita;
    }

    public void setFec_visita(Date Fec_visita) {
        this.Fec_visita = Fec_visita;
    }

    public int getPuntajeUsuario() {
        return PuntajeUsuario;
    }

    public void setPuntajeUsuario(int PuntajeUsuario) {
        this.PuntajeUsuario = PuntajeUsuario;
    }

    public int getPopulUsuario() {
        return PopulUsuario;
    }

    public void setPopulUsuario(int PopulUsuario) {
        this.PopulUsuario = PopulUsuario;
    }
    
}
