package es.android.coches.servicio.implementacion;
import android.content.Context;
import java.util.List;
import es.android.coches.entidad.Pregunta;
import es.android.coches.repositorio.interfaz.Repositorio;
import es.android.coches.servicio.interfaz.ServicioPreguntas;



public class ServicioPreguntasSQLiteImpl  implements  ServicioPreguntas{

    private Repositorio<Pregunta> repositorio;
    private List<Pregunta> todasLasPreguntas;
    



            @Override
            public List<String> generarRespuestasPosibles (String respuestaCorrecta,
            int numRespuestas){
            return null;
        }

            @Override
            public List<Pregunta> generarPreguntas (String recurso) throws Exception {
            return null;
        }

}
