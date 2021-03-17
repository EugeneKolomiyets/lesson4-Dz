package ua.alevel.array;

import java.util.Random;

public class arr {
    public static void main(String[] args) {
        //task1 Заполнить одномерный массив случайными целочисленными значениями. Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива - 400 элементов.
        int [] arr = new int[400];
        Random random = new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=1+random.nextInt(10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        double sumArif=0;
        for (int i = 0; i <arr.length ; i++) {
            sumArif+=arr[i];
          }
        sumArif=sumArif/arr.length;
        System.out.println("arif middle is "+sumArif);
        double sumGeom=1;
        for (int i = 0; i < arr.length; i++) {
            sumGeom*=arr[i];
        }
        sumGeom = Math.pow(sumGeom,1.0/arr.length);
        System.out.println("geom middle is " + sumGeom);
        //task2 task3
        //Заполнить одномерный массив случайными целочисленными значениями. Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
        //Заполнить одномерный массив случайными целочисленными значениями. Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.
        int[] arr2 = new int[1000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=1+random.nextInt(300);
            System.out.print(arr2[i]+" ");
        }
        //int[] arr2 = {1,9,4,5};

        System.out.println();
        int numberProst=0,numberSost=0;
        for (int i = 0; i <arr2.length ; i++) {
            int test=arr2[i],porog=(int)(test/2)+1;
            //System.out.println(test+" "+porog);
            boolean prostTest=true;
            if (test==1){
                prostTest=false;
            }
            for (int j = 2; j <= porog; j++) {
                //System.out.print(j + " ");
                if (test % j == 0) {
                    prostTest = false;
                    break;
                }
            }
             if (prostTest)
                 numberProst+=1;
              else
                 numberSost+=1;


            //System.out.println(prostTest);
            //System.out.println();
        }
        System.out.println("Number prost is "+numberProst);
        System.out.println("Number sost is "+numberSost);

        //task4 Заполнить одномерный массив случайными целочисленными значениями. Все четные значения заменить на нули. Размер массива - 2000 элементов.
        int [] arr3 = new int [2000];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=1+random.nextInt(5000);
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]%2==0)
                arr3[i]=0;
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        //task5 Заполнить одномерный массив случайными целочисленными значениями. Отсортировать элементы в обратном порядке методом вставки (Insertion Sort) либо методом выбора (Selection sort). Размер массива 1000 элементов.
        int [] arr4 = new int [1000];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i]=1+random.nextInt(400);
            System.out.print(arr4[i]+" ");
        }
        System.out.println();

        for (int i = 0; i <arr4.length ; i++) {
            int max = arr4[arr4.length - 1];
            int maxId = arr4.length - 1;
            for (int j = arr4.length-1; j >= i; j--) {
                if (arr4[j] > max) {
                    max = arr4[j];
                    maxId=j;
                }
            }
             if (arr4[i]!=max){
                int tempInt=arr4[i];
                arr4[i]=max;
                arr4[maxId]=tempInt;
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+" ");
        }
        System.out.println();
    }
}
