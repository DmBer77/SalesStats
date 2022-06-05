package ru.netology.stats;

public class StatsService {

    // сумма всех элементов
    public int sumSales(int[] sales) {
        int sumOfElements = 0;
        for (int sale : sales) {
            sumOfElements += sale;
        }
        return sumOfElements;
    }

    // среднее значение
    public double averageSum(int[] sales) {
        int sumOfElements = 0;
        int amountOfElements = sales.length;
        int avSum = 0;
        for (int sale : sales) {
            sumOfElements += sale;
            avSum = sumOfElements / amountOfElements;
        }
        return avSum;
    }

    // Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего
    public int elementsBelowTheAverage(int[] sales) {
        int sumOfElements = 0;
        int amountOfElements = sales.length;
        int belowTheAverage = 0;
        for (int sale : sales) {
            sumOfElements += sale;
        }
        int avSum = sumOfElements / amountOfElements;
        for (int i = 0; i < amountOfElements; i++) {
            if (sales[i] < avSum) {
                belowTheAverage = belowTheAverage + 1;
            }
        }
        return belowTheAverage;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public int elementsAboveTheAverage(int[] sales) {
        int sumOfElements = 0;
        int amountOfElements = sales.length;
        int aboveTheAverage = 0;
        for (int sale : sales) {
            sumOfElements += sale;
        }
        int avSum = sumOfElements / amountOfElements;
        for (int i = 0; i < amountOfElements; i++) {
            if (sales[i] > avSum) {
                aboveTheAverage = aboveTheAverage + 1;
            }
        }
        return aboveTheAverage;
    }
}
