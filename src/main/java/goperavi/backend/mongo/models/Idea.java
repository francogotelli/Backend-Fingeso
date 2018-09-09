package goperavi.backend.mongo.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ideas")
public class Idea {

    @Field("nombre")
    private String nombre;

    private Integer evaluacionesPositivas;
    private Integer evaluacionesNegativas;
    private Boolean esReto;

    private String descripcion;
    private String fecha;

    public Idea() {}

    public Idea(String nombre,  Integer evaluacionesNegativas, Integer evaluacionesPositivas, Boolean esReto, String descripcion, String fecha) {
        this.nombre = nombre;
        this.evaluacionesNegativas = evaluacionesNegativas;
        this.evaluacionesPositivas = evaluacionesPositivas;
        this.esReto = esReto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEvaluacionesNegativas() {
        return evaluacionesNegativas;
    }

    public Integer getEvaluacionesPositivas() {
        return evaluacionesPositivas;
    }

    public Boolean getEsReto() {
        return esReto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
}