package goperavi.backend.mongo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "ideas")
public class Idea {

    @Id
    public String id;
    private String nombre;
    private Integer evaluacionesPositivas;
    private Integer evaluacionesNegativas;
    private String descripcion;

    public Idea() {
    }

    public Idea(String nombre, Integer evaluacionesPositivas, Integer evaluacionesNegativas, String descripcion) {
        this.nombre = nombre;
        this.evaluacionesPositivas = evaluacionesPositivas;
        this.evaluacionesNegativas = evaluacionesNegativas;
        this.descripcion = descripcion;
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

    public Integer getEvaluacionesPositivas() {
        return evaluacionesPositivas;
    }

    public void setEvaluacionesPositivas(Integer evaluacionesPositivas) {
        this.evaluacionesPositivas = evaluacionesPositivas;
    }

    public Integer getEvaluacionesNegativas() {
        return evaluacionesNegativas;
    }

    public void setEvaluacionesNegativas(Integer evaluacionesNegativas) {
        this.evaluacionesNegativas = evaluacionesNegativas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}