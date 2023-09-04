import java.util.*;

public class HorasTrabajadas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nombre del Trabajador NOM");
        String NombreTrabajador=input.nextLine();
        System.out.println("Numero de horas trabajadas NHT");
        int NumHorasTrabajadas= input.nextInt();
        System.out.println("Valor horas trabajadas VHN");
        int ValorHorasTrabajoNorm= input.nextInt();

        int HorasExtras=0;
        if(NumHorasTrabajadas>40){
            HorasExtras=NumHorasTrabajadas-40;
        }

        int Salario=0;
        int HorasExtrasMay8=HorasExtras-8;;

        if(HorasExtras>8){
            Salario=40*ValorHorasTrabajoNorm+((ValorHorasTrabajoNorm*8)*2)+((ValorHorasTrabajoNorm*HorasExtrasMay8)*3);
        }
        else if(HorasExtras<8 && HorasExtras>0){
            Salario=40*ValorHorasTrabajoNorm+((ValorHorasTrabajoNorm*HorasExtras)*2);
        }
        else{
            Salario=ValorHorasTrabajoNorm*NumHorasTrabajadas;
        }
        System.out.println("El TRABAJADOR "+NombreTrabajador+" DEVENGO: "+"$"+Salario);

    }
}