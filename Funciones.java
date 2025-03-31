public class Funciones {
    public static void main (String []args){

        
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio1(){

        int capital = 100000;
        double capitalnuevo = 0;
    
        capitalnuevo = capital * 0.02;
    
        System.out.println("La ganancia de en el banco despues de un mes "+ capitalnuevo);
    }
    public void getEjercicio1(){Ejercicio1();}
    //////////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio2(){

        int sueldobase = 40000;
        double comision1 = 0; 
        double comision2 = 0; 
        double comision3 = 0;
        double comisiontotal = 0;  
        int venta1 = 5000;
        int venta2 = 3000;
        int venta3 = 2000;
        double sueldototal = 0;
        
        
        comision1 = venta1 * 0.10;
        System.out.println("La comision de la primera venta fue "+ comision1);

        comision2 = venta2 * 0.10;
        System.out.println("La comision de la Segunda venta fue "+ comision2);
        
        comision3 = venta3 * 0.10;
        System.out.println("La comision de la Tercera venta fue "+ comision3);

        comisiontotal = comision1+comision2+comision3;
        System.out.println("La comision total que obtuvo por las tres ventas fue de " + comisiontotal);

        System.out.println("El Sueldo base del vendedor es de " + sueldobase);

        sueldototal = comisiontotal+sueldobase;
        System.out.println("Por ende el sueldo total del vendedor en esete mes es de " + sueldototal );
    }
    public void getEjercicio2(){Ejercicio2();}
    ////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio3(){
        int compra = 89675;
        System.out.println("El valor total de la compra es de $" + compra );
    double descuento = 0;
    double descuentototal = 0;
    double total_a_pagar = 0;

    descuento = compra * 0.15; 
    System.out.println("El descuento por el valor de la compra es de $"+ descuento);
    descuentototal = compra - descuento;

    System.out.println("El descuento total es de $" + descuentototal);
    total_a_pagar = descuentototal;
    System.out.println("Por lo cual el valor total que él cliente debe pagar es de $"+ total_a_pagar);

    }
    public void getEjercicio3(){Ejercicio3();}
    //////////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio4(){
        double cal1 = 4.5;
        double cal2 = 3.5;
        double cal3 = 4.1;
        double promedio = 0;
        double examenfinal = 3.1;
        double trabajofinal = 4.5;
        double notafinal = 0;
        
        
        promedio = (cal1 + cal2 + cal3)/3;

        System.out.println("El promedio de de calificaciones es de las tres parciales es de "+ promedio);

        notafinal = (promedio + examenfinal + trabajofinal)/3;

        System.out.println("La nota final de la asignatura es de: "+notafinal );   
    }
    public void getEjercicio4(){Ejercicio4();}
    //////////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio5(){
        int estudiantes = 30;
        int mujeres = 18;
        int hombres = 12;
        int porchombres = 0;
        int porcmujeres = 0;

        porchombres = (hombres *100) / estudiantes; 

        porcmujeres = (mujeres * 100) / estudiantes;

        System.out.println("El porcentaje de hombres en el salon es de "+porchombres+"%");
        System.out.println("El porcentaje de mujeres en el salon es de "+porcmujeres+"%"); 
    }
    public void getEjercicio5(){Ejercicio5();}
    ////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio7(){
        double metros = 2.0;
        double pulgadasmetro = 39.27;
        double pulgadaspie = 12;
        double pulgadas = 0;
        double pies = 0; 
        
        pulgadas = metros * pulgadasmetro; 
        System.out.println(" la medida en pulgadas es de " + pulgadas); 
        pies = metros / pulgadaspie; 
        System.out.println("La medida en pies es de " + pies); 
    }
    public void getEjercicio7(){Ejercicio7();}
    /////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio8(){
            int a = 5; 
    int b = 4;
    int c = 2;
    int p = 0;
    
    double p3 = 2;

    p = (a+b+c)/2;

    System.out.println("El Valor de P es de: " + p);

    System.out.println("Por lo cual se podria decir que: el area del triangulos es la siguiente: ");

    double s = p * ((p-a) * (p-b)* (p-c));

    p3 = Math.sqrt(s); 

    System.out.println("El area es de: "+p3);
    }
    public void getEjercicio8(){Ejercicio8();}
    /////////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio9(){
        double horastrabajadas = 40;
        double preciohora = 20;
        double descimpuestos = 0.10;
        double salariobase = 0;
        double impuestos = 0; 
        double salarioneto = 0; 
        
        salariobase = horastrabajadas * preciohora;
        impuestos = salariobase * descimpuestos; 
        salarioneto = salariobase - impuestos; 
        
        System.out.println("El salario neto del empleado es de $" + salarioneto); 
    }
    public void getEjercicio9(){Ejercicio9();}
    /////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio10(){
        final double CHELIN_A_PESETAS = 956.871 / 100; 
        final double DRACMA_A_PESETAS = 88.607 / 100;  
        final double PESETAS_A_DOLAR = 1 / 122.499;    
        final double PESETAS_A_LIRA = 100 / 9.289;     
        final double PESETAS_A_FRANCO_FRANCES = 1 / 20.110; 

        
        double chelinesAustriacos = 50.0; 
        double dracmasGriegos = 100.0;    
        double pesetas = 1000.0;          

        
        double pesetasDeChelines = chelinesAustriacos * CHELIN_A_PESETAS;

        
        double pesetasDeDracmas = dracmasGriegos * DRACMA_A_PESETAS;
        double francosFrancesesDeDracmas = pesetasDeDracmas * PESETAS_A_FRANCO_FRANCES;

        
        double dolaresDePesetas = pesetas * PESETAS_A_DOLAR;
        double lirasDePesetas = pesetas * PESETAS_A_LIRA;

        
        System.out.println(chelinesAustriacos + " chelines austriacos = " + pesetasDeChelines + " pesetas");
        System.out.println(dracmasGriegos + " dracmas griegos = " + francosFrancesesDeDracmas + " francos franceses");
        System.out.println(pesetas + " pesetas = " + dolaresDePesetas + " dólares");
        System.out.println(pesetas + " pesetas = " + lirasDePesetas + " liras italianas");  
    }
    public void getEjercicio10(){Ejercicio10();}
    /////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio11(){
        double INCREMENTO_HORA_EXTRA = 0.25; 
        double PARO_FORZOSO = 0.05;         
        double POLITICA_HABITACIONAL = 0.02; 
        double CAJA_AHORRO = 0.07;           
        double ACTUALIZACION_ACADEMICA = 25000.0; 
        double POR_HIJO = 17300.0;           
        double PRIMA_HOGAR = 18000.0;        
        int numeroHijos = 2;                       
        double horasNormales = 8;
        double pagoHoraNormal = 6400;
        double horasExtras = 7;
        
        double sueldoBase = (horasNormales * pagoHoraNormal)+(horasExtras * pagoHoraNormal * (1 + INCREMENTO_HORA_EXTRA));

         
        double asignaciones = ACTUALIZACION_ACADEMICA + (numeroHijos * POR_HIJO) + PRIMA_HOGAR;

        
        double deducciones = (sueldoBase * PARO_FORZOSO) +
                             (sueldoBase * POLITICA_HABITACIONAL) +
                             (sueldoBase * CAJA_AHORRO);

       
        double sueldoNeto = sueldoBase + asignaciones - deducciones;

        
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Asignaciones: " + asignaciones);
        System.out.println("Deducciones: " + deducciones);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
    public void getEjercicio11(){Ejercicio11();}
    ///////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio12(){
        double examenMatematica = 85.0; 
        double tarea1Matematica = 90.0; 
        double tarea2Matematica = 80.0; 
        double tarea3Matematica = 95.0; 

        double examenFisica = 78.0;     
        double tarea1Fisica = 85.0;    
        double tarea2Fisica = 88.0;    

        double examenQuimica = 92.0;   
        double tarea1Quimica = 87.0;   
        double tarea2Quimica = 90.0;   
        double tarea3Quimica = 91.0;   

        
        double promedioTareasMatematica = (tarea1Matematica + tarea2Matematica + tarea3Matematica) / 3;
        double promedioMatematica = (examenMatematica * 0.90) + (promedioTareasMatematica * 0.10);

        
        double promedioTareasFisica = (tarea1Fisica + tarea2Fisica) / 2;
        double promedioFisica = (examenFisica * 0.80) + (promedioTareasFisica * 0.20);

        
        double promedioTareasQuimica = (tarea1Quimica + tarea2Quimica + tarea3Quimica) / 3;
        double promedioQuimica = (examenQuimica * 0.85) + (promedioTareasQuimica * 0.15);

       
        double promedioGeneral = (promedioMatematica + promedioFisica + promedioQuimica) / 3;

      
        System.out.println("Promedio en Matemática: " + promedioMatematica);
        System.out.println("Promedio en Física: " + promedioFisica);
        System.out.println("Promedio en Química: " + promedioQuimica);
        System.out.println("Promedio general: " + promedioGeneral);
    }
    public void getEjercicio12(){Ejercicio12();}
    /////////////////////////////////////////////////////////////////////////////////////////////////
   private void Ejercicio13(){
    int N1 = 10; // Billetes de 50000
    int N2 = 20; // Billetes de 20000
    int N3 = 30; // Billetes de 10000
    int N4 = 40; // Billetes de 5000
    int N5 = 50; // Billetes de 2000
    int N6 = 60; // Billetes de 1000
    int N7 = 70; // Billetes de 500
    int N8 = 80; // Billetes de 100

    // Valor de cada denominación
     int BILLETE_50000 = 50000;
     int BILLETE_20000 = 20000;
     int BILLETE_10000 = 10000;
     int BILLETE_5000 = 5000;
     int BILLETE_2000 = 2000;
     int BILLETE_1000 = 1000;
     int BILLETE_500 = 500;
     int BILLETE_100 = 100;

    
    double dineroTotal = (N1 * BILLETE_50000) + (N2 * BILLETE_20000) + (N3 * BILLETE_10000) + (N4 * BILLETE_5000) + (N5 * BILLETE_2000) + (N6 * BILLETE_1000) + (N7 * BILLETE_500) +  (N8 * BILLETE_100);


    System.out.println("El dinero total en el banco es: " + dineroTotal);
   }
   public void getEjercicio13(){Ejercicio13();}
   ///////////////////////////////////////////////////////////////////////////////////////
   private void Ejercicio14(){
    double a = 2.0; 
    double b = 3.0; 
    double c = 5.0; 
    double d = 4.0; 
    double e = -1.0; 
    double f = 2.0; 

    
    double denominador = a * e - b * d;

    
    if (denominador == 0) {
        System.out.println("El sistema no tiene solución única.");
    } else {
        // Calcular x e y usando las fórmulas
        double x = (c * e - b * f) / denominador;
        double y = (a * f - c * d) / denominador;

        // Mostrar resultados
        System.out.println("x = " + x);
        System.out.println("y = " + y);

     }
    }
    public void getEjercicio14(){Ejercicio14();}
    ////////////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio15(){

        double lecturaAnterior = 500.0; 
        double lecturaActual = 650.0;   
        double costoKilovatio = 0.15;   

        
        double consumo = lecturaActual - lecturaAnterior;

        
        double montoTotal = consumo * costoKilovatio;

        
        System.out.println("Consumo en kilovatios: " + consumo);
        System.out.println("Monto total a pagar: " + montoTotal);    
    }
    public void getEjercicio15(){Ejercicio15();}
    ////////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio16(){
        double largoLamina = 4.0; 
        double anchoLamina = 1.5; 

        
        double consumoPieza = 0.5; 

      
        double areaLamina = largoLamina * anchoLamina;

        
        int numeroPiezas = (int) (areaLamina / consumoPieza);

     
        double desperdicio = areaLamina - (numeroPiezas * consumoPieza);

        
        System.out.println("Número de piezas fabricadas: " + numeroPiezas);
        System.out.println("Desperdicio de material: " + desperdicio + " metros cuadrados");  
    }
    public void getEjercicio16(){Ejercicio16();}
    ////////////////////////////////////////////////////////////////////////////
    private void Ejercicio17(){

        double precioFinal = 80.0; 
        double pvp = 100.0;       

        
        double descuento = ((pvp - precioFinal) / pvp) * 100;

       
        System.out.println("Porcentaje de descuento: " + descuento + "%");   
    }
    public void getEjercicio17(){Ejercicio17();}
    ///////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio18(){
        double galonesSuridos = 10.0; 
        double litrosPorGalon = 3.785;
        double precioPorLitro = 100.0; 

        
        double litrosSuridos = galonesSuridos * litrosPorGalon;

        
        double montoCobrar = litrosSuridos * precioPorLitro;

        
        System.out.println("Litros surtidos: " + litrosSuridos);
        System.out.println("Monto a cobrar: " + montoCobrar + " Bolívares"); 
    }
    public void getEjercicio18(){Ejercicio18();}
    ////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio19(){

        double presupuestoAnual = 1000000.0; 

        double PORCENTAJE_GINECOLOGIA = 0.40; 
        double PORCENTAJE_TRAUMATOLOGIA = 0.30; 
        double PORCENTAJE_PEDIATRIA = 0.30; 

        double presupuestoGinecologia = presupuestoAnual * PORCENTAJE_GINECOLOGIA;
        double presupuestoTraumatologia = presupuestoAnual * PORCENTAJE_TRAUMATOLOGIA;
        double presupuestoPediatria = presupuestoAnual * PORCENTAJE_PEDIATRIA;

        
        System.out.println("Presupuesto para Ginecología: " + presupuestoGinecologia);
        System.out.println("Presupuesto para Traumatología: " + presupuestoTraumatologia);
        System.out.println("Presupuesto para Pediatría: " + presupuestoPediatria);  
    }
    public void getEjercicio19(){Ejercicio19();}
    /////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio20(){
        double capital = 10000.0; 
        double interesesPagados = 2000.0; 
        int tiempo = 4; 

       
        double razon = (interesesPagados * 100) / (capital * tiempo);

        
        System.out.println("El porcentaje anual cobrado es: " + razon + "%");
    }
    public void getEjercicio20(){Ejercicio20();}
    ////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio21(){
        int X = 48000; 
        double Y = 6.0; 
        double K = 42000.0; 

        double costoTotal = (X / 12.0) * Y;

        double ganancia = K - costoTotal;

        double porcentajeGanancia = (ganancia / costoTotal) * 100;

        System.out.println("Costo total de compra: " + costoTotal + " Bolívares");
        System.out.println("Ganancia: " + ganancia + " Bolívares");
        System.out.println("Porcentaje de ganancia: " + porcentajeGanancia + "%");  
    }
    public void getEjercicio21(){Ejercicio21();}
    ///////////////////////////////////////////////////////////////////////////////
    private void Ejercicio22(){
       
        double precioContado = 1200.0; 
        double cuotaMensual = 120.0;  
        int numeroCuotas = 12;       

        double precioCuotas = cuotaMensual * numeroCuotas;

        double recargo = precioCuotas - precioContado;

        double porcentajeRecargo = (recargo / precioContado) * 100;

        System.out.println("Precio al contado: " + precioContado + " Bolívares");
        System.out.println("Precio en cuotas: " + precioCuotas + " Bolívares");
        System.out.println("Recargo: " + recargo + " Bolívares");
        System.out.println("Porcentaje de recargo: " + porcentajeRecargo + "%");
    }
    public void getEjercicio22(){Ejercicio22();}
    /////////////////////////////////////////////////////////////////////////////////
    private void Ejercicio23(){

        int M = 452; 
        int N = 197; 
        double B1 = 132.0; 
        double B2 = 180.0; 
        double B3 = 7.50; 
        double B4 = 14.50; 

        int paquetesPorBulto = 24;
        int bultosHarina = M / paquetesPorBulto;
        double ingresoBultosHarina = bultosHarina * B1;

        int harinaRestante = M % paquetesPorBulto;
        double ingresoDetalHarina = harinaRestante * B3;

        int envasesPorCaja = 15;
        int cajasAceite = N / envasesPorCaja;
        double ingresoCajasAceite = cajasAceite * B2;

        int aceiteRestante = N % envasesPorCaja;
        double ingresoDetalAceite = aceiteRestante * B4;

        double ingresoTotal = ingresoBultosHarina + ingresoDetalHarina + ingresoCajasAceite + ingresoDetalAceite;

        System.out.println("Ingreso por bultos de harina: " + ingresoBultosHarina + " Bolívares");
        System.out.println("Ingreso por harina al detal: " + ingresoDetalHarina + " Bolívares");
        System.out.println("Ingreso por cajas de aceite: " + ingresoCajasAceite + " Bolívares");
        System.out.println("Ingreso por aceite al detal: " + ingresoDetalAceite + " Bolívares");
        System.out.println("Ingreso total: " + ingresoTotal + " Bolívares");   
    }
    public void getEjercicio23(){Ejercicio23();}
}
