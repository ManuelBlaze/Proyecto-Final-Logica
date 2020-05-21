/*
Proyecto:

Sistematizar un negocio de tortas que cuenta con un portafolio de varios tipos de productos
debe ayudar a atender y calcular la compra de un pedido y pedir el dinero y dar devuelta si es necesario, 
cada tipo de producto debera tener un costo tiene un costo.

 */
package com.mycompany.panaderia_dals;

import java.util.Scanner;

public class TORTERIA {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String compra = "si";
        String Productos[] = {"(1).Tortas", "(2).Tortas Tematicas", "(3).Postes", "(4).Tortas Refrigeradas"};
        System.out.println("\n");

        double precio = 0, subtotal = 0;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                  BIENVENIDOS A OBO SU TORTERIA                    ");
        System.out.println("-------------------------------------------------------------------");
        
        while (compra.equals("si")) {
            System.out.println("----------------------");
            System.out.println("     |Categorias|     ");
            System.out.println("----------------------");
            for (String i : Productos) {
                System.out.println(i);
            }
            System.out.println("\n");
            System.out.println("Seleccione la categoria que desea visualizar: ");
            System.out.println("| 1 | 2 | 3 | 4 |");
            String tipo = In.next();

            System.out.println(" ");
            String Tortas[] = {"(1).Maria Luisa", "(2).Torta Envinada", "(3).Torta Chocolate", "(4).Torta de vainilla"};
            String TortasTem[] = {"(1).Primera Comunion", "(2).Matrimonios", "(3).Cumpleaños", "(4).AdultosTentacion"};
            String Postres[] = {"(1).Chocolate),(2).Vainilla,(3).Fresa,(4).Brownie"};
            String TortasRef[] = {"(1).Esponjosas", "(2).Rollo"};

            // Switch tipo de tortas
            String producto = " ";

            switch (tipo) {

                case "1":
                    System.out.println("-----------");
                    System.out.println("   TORTA   ");
                    System.out.println("-----------");
                    for (String a : Tortas) {
                        System.out.println(a);
                    }

                    System.out.println("Selecciona el producto desea llevar: ");
                    System.out.println("| 1 | 2 | 3 | 4 |");
                    producto = In.next();
                    switch (producto) {
                        case "1":
                            precio = 40000;
                            subtotal += precio;
                            System.out.println("El valor de la torta es : " + precio);
                            break;

                        case "2":
                            precio = 80000;
                            subtotal += precio;
                            System.out.println("El valor de la torta es : " + precio);
                            break;

                        case "3":
                            precio = 32000;
                            subtotal += precio;
                            System.out.println("El valor de la torta es : " + precio);
                            break;

                        case "4":
                            precio = 32000;
                            subtotal += precio;
                            System.out.println("El valor de la torta es : " + precio);
                            break;
                        default:
                            System.out.println("Este producto no existe en el catalogo");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("---------------------------");
                    System.out.println("      TORTA TEMATICA       ");
                    System.out.println("---------------------------");
                    for (String b : TortasTem) {
                        System.out.println(b);
                    }

                    System.out.println("Selecciona el producto desea llevar: ");
                    System.out.println("| 1 | 2 | 3 | 4 |");
                    producto = In.next();
                    switch (producto) {
                        case "1":
                            precio = 120000;
                            subtotal += precio;
                            System.out.println("El valor de la torta tematica es : " + precio);
                            break;

                        case "2":
                            precio = 180000;
                            subtotal += precio;
                            System.out.println("El valor de la torta tematica es : " + precio);
                            break;

                        case "3":
                            precio = 132000;
                            subtotal += precio;
                            System.out.println("El valor de la torta tematica es : " + precio);
                            break;

                        case "4":
                            precio = 322000;
                            subtotal += precio;
                            System.out.println("El valor de la torta tematica es : " + precio);
                            break;

                        default:
                            System.out.println("Este producto no existe en el catalogo");
                            break;
                    }
                    break;

                case "3":
                    System.out.println("-----------------");
                    System.out.println("     POSTRES     ");
                    System.out.println("-----------------");
                    for (String c : Postres) {
                        System.out.println(c);
                    }

                    System.out.println("Selecciona el producto desea llevar: ");
                    System.out.println("| 1 | 2 | 3 | 4 |");
                    producto = In.next();
                    switch (producto) {
                        case "1":
                            precio = 9000;
                            subtotal += precio;
                            System.out.println("El valor del postre es : " + precio);
                            break;

                        case "2":
                            precio = 9000;
                            subtotal += precio;
                            System.out.println("El valor del postre es : " + precio);
                            break;

                        case "3":
                            precio = 9000;
                            subtotal += precio;
                            System.out.println("El valor del postre es : " + precio);
                            break;

                        case "4":
                            precio = 9000;
                            subtotal += precio;
                            System.out.println("El valor del postres es : " + precio);
                            break;
                        default:
                            System.out.println("Este producto no existe en el catalogo");
                            break;
                    }
                    break;

                case "4":
                    System.out.println("--------------------------------------");
                    System.out.println("         TORTAS REFRIGERADAS          ");
                    System.out.println("--------------------------------------");
                    for (String d : TortasRef) {
                        System.out.println(d);
                    }

                    System.out.println("Selecciona el producto desea llevar: ");
                    System.out.println("| 1 | 2 |");
                    producto = In.next();
                    switch (producto) {
                        case "1":
                            precio = 25000;
                            subtotal += precio;
                            System.out.println("El valor de la torta refrigerada es : " + precio);
                            break;

                        case "2":
                            precio = 25000;
                            subtotal += precio;
                            System.out.println("El valor de la torta refrigerada es : " + precio);
                            break;

                        default:
                            System.out.println("Este producto no existe en el catalogo");
                            break;
                    }
                    break;

                default:
                    System.out.println("No existe esta categoria Ingrese otra Porfavor ");

                    break;

            }
            System.out.println("Desea añadir otro producto |si|no|");
            compra = In.next();
        }
        System.out.println("El Total a pagar es: " + subtotal);

        double dinero = 0;
        System.out.println("Ingrese el dinero de la compra: ");
        dinero = In.nextDouble();

        if (dinero >= subtotal) {
            double devuelta = dinero - subtotal;
            System.out.println("Su devuelta es: " + devuelta);
            System.out.println("Gracias por su compra vuelva pronto");
        } else {
            while (subtotal > dinero) {
                double faltante = (subtotal - dinero);
                System.out.println("El dinero faltante es: " + faltante);
                System.out.println("Ingrese dinero restante para continuar: ");
                double dinero2 = In.nextDouble();

                dinero += dinero2;
               
            }
            if (dinero >= subtotal) {
                double devuelta = dinero - subtotal;
                System.out.println("Su devuelta es: " + devuelta);
                System.out.println("Gracias por su compra vuelva pronto");
            }
        
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
