public class Date {
    public static void main(String[] args){
        Date correctDate = new Date(2023, 5, 30);
        correctDate.printDate();

        Date incorrectDate = new Date(2023, 13, 30);
        incorrectDate.printDate();

        Date invalidLeapYearDate = new Date(2023, 2, 29);
        invalidLeapYearDate.printDate();

        Date firstDayOfMonth = new Date(2023, 9, 1);
        firstDayOfMonth.printDate();
        
    }
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isCorrectDate() {
        if (month < 1 || month > 12) return false;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return day >= 1 && day <= 31;
            case 4: case 6: case 9: case 11:
                return day >= 1 && day <= 30;
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return day >= 1 && day <= 29;
                } else {
                    return day >= 1 && day <= 28;
                }
        }

        return false;
    }

    public void printDate() {
        System.out.println("Dátum: " + year + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }

    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
}
