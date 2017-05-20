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
public class Pregunta {
    
    private String IdPregunta;
//    private	String	IdPregunta;
    private	String	ContePregunta;
//    private	imagen	ImaPregunta;
    private	String	Etiqueta1;
    private	String	Etiqueta2;
    private	String	Etiqueta3;
    private	String	Etiqueta4;
    private	String	Etiqueta5;
    private	String	AreaConocimiento;
    private	String	Curso;
    private	String	Estado;
    private	Date	FechaRegistro;
    private	Double	PopulPregunta;
    private	String	IdUsuario;
    
/*
       public String getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(String IdPregunta) {
        this.IdPregunta = IdPregunta;
    } 
    
        public String getContePregunta() {
        return ContePregunta;
    }

    public void setContePregunta(String ContePregunta) {
        this.ContePregunta = ContePregunta;
    } 
    */

    public String getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(String IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    public String getContePregunta() {
        return ContePregunta;
    }

    public void setContePregunta(String ContePregunta) {
        this.ContePregunta = ContePregunta;
    }

    public String getEtiqueta1() {
        return Etiqueta1;
    }

    public void setEtiqueta1(String Etiqueta1) {
        this.Etiqueta1 = Etiqueta1;
    }

    public String getEtiqueta2() {
        return Etiqueta2;
    }

    public void setEtiqueta2(String Etiqueta2) {
        this.Etiqueta2 = Etiqueta2;
    }

    public String getEtiqueta3() {
        return Etiqueta3;
    }

    public void setEtiqueta3(String Etiqueta3) {
        this.Etiqueta3 = Etiqueta3;
    }

    public String getEtiqueta4() {
        return Etiqueta4;
    }

    public void setEtiqueta4(String Etiqueta4) {
        this.Etiqueta4 = Etiqueta4;
    }

    public String getEtiqueta5() {
        return Etiqueta5;
    }

    public void setEtiqueta5(String Etiqueta5) {
        this.Etiqueta5 = Etiqueta5;
    }

    public String getAreaConocimiento() {
        return AreaConocimiento;
    }

    public void setAreaConocimiento(String AreaConocimiento) {
        this.AreaConocimiento = AreaConocimiento;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public Double getPopulPregunta() {
        return PopulPregunta;
    }

    public void setPopulPregunta(Double PopulPregunta) {
        this.PopulPregunta = PopulPregunta;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
}


/*IdPregunta	string	autogenerado
ContePregunta	string	
ImaPregunta	imagen	
Etiqueta1	string	
Etiqueta2	string	
Etiqueta3	string	
Etiqueta4	string	
Etiqueta5	string	
AreaConocimiento	string	
Curso	string	
Estado	string	sin contestar, contestada,revisada
FechaRegistro	date	
PopulPregunta	double	
IdUsuario	string	
*/

/*
package todoClasses;

import java.util.Date;

public class Task {
    
    private String title;
    private String description;
    private Date createdDate;
    private Date deadline;
    private int priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }    
    
}*/