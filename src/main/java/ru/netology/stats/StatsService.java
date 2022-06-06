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
        int sumOfElements = sumSales(sales);
        int amountOfElements = sales.length;
        return sumOfElements / amountOfElements;
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
        int belowTheAverage = 0;
        double avSum = averageSum(sales);
        for (int sale : sales) {
            if (sale < avSum) {
                belowTheAverage = belowTheAverage + 1;
            }
        }
        return belowTheAverage;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public int elementsAboveTheAverage(int[] sales) {
        int aboveTheAverage = 0;
        double avSum = averageSum(sales);
        for (int sale : sales) {
            if (sale > avSum) {
                aboveTheAverage = aboveTheAverage + 1;
            }
        }
        return aboveTheAverage;
    }
}
