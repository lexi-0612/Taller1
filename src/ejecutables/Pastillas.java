package ejecutables;

import Medicamentos.Medicamento;

public class Pastillas {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento( "acetaminofen",
                "señora", "oral");
        Medicamento.Posologia posologia = new Medicamento.Posologia("niños", 2, 4, "No beber alcohol");

        System.out.println("Nombre del medicamento = " + medicamento.getNombre());
        System.out.println("Fabricante del medicamento = " + medicamento.getFabricante());
        System.out.println("Via de administracion = " + medicamento.getVia());
        System.out.println("Usuarios  = " + posologia.getUsuarios());

        System.out.println("Dosis = " + posologia.getDosis());
        System.out.println("Periodo = " + posologia.getPeriodo());
        System.out.println("Recomendaciones =" + posologia.getRecomendaciones());



    }
}
