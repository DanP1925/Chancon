/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Respuesta {
    
    private	String	idRespuesta;	//autogenerado
    private	String	idPregunta;	
    private	String	ConteRespuesta;	
    //private	imagen	ImaRespuesta;	
    private	String	idUsuario;	
    private	Integer	Calificacion;	
    private	Date	FechaRegistro;	
    private	Integer	PopulRespuesta;

    public String getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(String idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getConteRespuesta() {
        return ConteRespuesta;
    }

    public void setConteRespuesta(String ConteRespuesta) {
        this.ConteRespuesta = ConteRespuesta;
    }
/*
    public imagen getImaRespuesta() {
        return ImaRespuesta;
    }

    public void setImaRespuesta(imagen ImaRespuesta) {
        this.ImaRespuesta = ImaRespuesta;
    }
*/
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Integer Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public Integer getPopulRespuesta() {
        return PopulRespuesta;
    }

    public void setPopulRespuesta(Integer PopulRespuesta) {
        this.PopulRespuesta = PopulRespuesta;
    }
    
    

}
