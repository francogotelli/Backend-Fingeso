import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Document(collection = "ideas")
public class Idea {

    @Field("nombre")
    private String nombre;

    private Interger evaluacionesPositivas;
    private Integer evaluacionesNegativas;
    private Boolean esReto;

    private String descripcion;
    private String fecha;

    public Idea() {}

    public Occurrence(String nombre,  Interger evaluacionesNegativas, Integer evaluacionesPositivas, Boolean esReto, String descripcion, String fecha) {
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

    public Interger getEvaluacionesNegativas() {
        return evaluacionesNegativas;
    }

    public Interger getEvaluacionesPositivas() {
        return evaluacionesPositivas;
    }

    public Boolean getEsReto() {
        return esReto;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public Date getFecha() {
        return fecha;
    }
}