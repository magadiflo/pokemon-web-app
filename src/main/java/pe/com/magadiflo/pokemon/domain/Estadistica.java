package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Esta anotación permite que se ignore las otras propiedades del objeto que 
//no se están comando en cuenta en esta clase
@JsonIgnoreProperties(ignoreUnknown = true)
public class Estadistica {

    private String name;

    public Estadistica() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estadistica{name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
