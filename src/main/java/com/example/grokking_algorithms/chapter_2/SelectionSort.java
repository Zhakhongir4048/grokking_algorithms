package com.example.grokking_algorithms.chapter_2;

public class SelectionSort {

    public static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            // Получаем позицию, индекс массива
            int pos = i;
            // Получаем минимальный элемент. Первая итерация цикла, минимальный элемент - первый индекс
            int min = sortArr[i];
            // Цикл выбора наименьшего элемента. Первый элемент сравниваем со вторым, дальше второй с третьим и т.д
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    // Индекс наименьшего элемента
                    pos = j;
                    // Значение наименьшего элемента
                    min = sortArr[j];
                }
            }
            // Присваиваем индексу, где нашли минимальный элемент, другое значение, которое по циклу идём
            // Сделано для того, что был swap. Чтобы дальше искались элементы, уже не учитывая значение снизу которое
            sortArr[pos] = sortArr[i];
            // Меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        selectionSort(sortArr);
        for (int j : sortArr) {
            System.out.print(j + "\n");
        }
    }

}