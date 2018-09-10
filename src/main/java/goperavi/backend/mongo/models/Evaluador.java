package goperavi.backend.mongo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "evaluadores")
public class Evaluador {

    @Id
    public String id;
    private String nombre;
    private String correo;
    private String idIdeas;

    public Evaluador() {
    }

    public Evaluador(String nombre, String correo, String idIdeas) {
        this.nombre = nombre;
        this.correo = correo;
        this.correo = idIdeas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdIdeas() {
        return idIdeas;
    }

    public void setIdIdeas(String idIdeas) {
        this.idIdeas = idIdeas;
    }
}