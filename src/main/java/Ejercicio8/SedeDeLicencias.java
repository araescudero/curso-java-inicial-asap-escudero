package Ejercicio8;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SedeDeLicencias {
    private List<Examen> examenes;

    public SedeDeLicencias(){
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen examen){
        this.examenes.add(examen);
    }

    public String obtenerInforme() {
        double porcReprobados = porcentajeDeReprobados();
        double promTiempoAutosAprobados = promTiempoAutosAprobados();

        Gson gson = new Gson();
        return gson.toJson(new Informe(porcReprobados, promTiempoAutosAprobados));
    }

    private double porcentajeDeReprobados() {
        int reprobados = 0;
        int totalExamenes = examenes.size();

        for (Examen examen : examenes) {
            if (!examen.isAprobado()) {
                reprobados++;
            }
        }

        return totalExamenes > 0 ? (reprobados * 100.0) / totalExamenes : 0;
    }

    private double promTiempoAutosAprobados() {
        int totalTiempo = 0;
        int count = 0;

        for (Examen examen : examenes) {
            if (examen instanceof ExamenDeAuto) {
                ExamenDeAuto examenAuto = (ExamenDeAuto) examen;
                if (examenAuto.isAprobado()) {
                    totalTiempo += examenAuto.getTiempoDelCircuito();
                    count++;
                }
            }
        }

        double promedio = count > 0 ? (double) totalTiempo / count : 0.0;

        return promedio;
    }

}
