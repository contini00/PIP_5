package com.company;

public class Main {

    public static void main(String[] args) {
	
    }
// ---------------------------------------------------------------------
   //METODA ZADANIE 1
    public static int[] revert(int[] arr){
        int[] tab = new int[arr.length];

        for (int i=0; i<arr.length; i++)
            tab[arr.length -i -1] = arr[i];
        return tab;
    }

    // METODA ZADANIE 2
    public static String arrayToString(int[] arr){
        String napis=("„" + arr[0] );
        for(int i=1; i < arr.length; i++){
            napis+=("," + arr[i]);
        } napis+="\"";
        System.out.print(napis);
        return napis;
    }

    //METODA ZADANIE 3
    public static int[] getEven(int[] arr){
        int[] tab = new int[arr.length];
        int y=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                tab[y]=arr[i];
                y++;
            }
        }
        int[] tabOstateczna = new int[y];
        for (int i=0; i<y ; i++){
            tabOstateczna[i]=tab[i];
        }
        wypisz(tabOstateczna);

        return tab;
    }

    // METODA ZADANIE 4
    public static boolean arrayEquals(int[] arr, int[] arr2){
        boolean wyjscie = true;
        int dlugosc;
        if(arr.length<arr2.length){
            dlugosc = arr2.length;
        } else dlugosc = arr.length;
        for(int i=0; i<dlugosc; i++){
            System.out.println(arr[i] + " a tu " + arr2[i]);
            if(arr[i]==arr2[i])
                wyjscie = true;
            else {
                wyjscie = false;
                System.out.println("Koniec: " + i);
                break;
            }
        }System.out.println(wyjscie);

        return true;
    }
    // METODA ZADANIE 5

    public static void wypisz(int[] arr){
        System.out.print("\"" + arr[0]);
        for (int i=1; i<arr.length; i++){
            System.out.print(","+ arr[i]);
        }
        System.out.print("\"");
    }

    //METODA ZADANIE 6
    public static boolean isInArray(double[] arr, double num){
        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                System.out.println("Liczba: " + num + " znajduje się w tablicy.");
                break;
            }if(i==(arr.length-1)){
                System.out.println("Liczba: " + num + " nie znajduje się w tablicy.");
            }
        }

        return true;
    }

    //METODA ZADANIE 7

    public static double getAlgebraicMean(double[] arr){
        double sredniaArytmetyczna = 0;
        double suma = 0;
        for(int i=0; i<arr.length; i++){
            suma+=arr[i];
            if(i==(arr.length-1)){
                sredniaArytmetyczna = suma/arr.length;
                break;
            }
        }
        System.out.println("Średnia arytmetyczna do: " + sredniaArytmetyczna);
        return sredniaArytmetyczna;
    }

    //METODA ZADANIE 8
    public static boolean isIncreasing(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                System.out.println("Elementy nie są w kolejności niemalejącej.");
                break;
            }if(i==arr.length-1){
                System.out.println("Elementy są w kolejności niemalejącej.");
            }
        }
        return true;
    }
}
