class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        IO.println("Grade = " + grade);
    }
}

class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            IO.println("Count is: " + count);
            count++;
        }
    }
}

class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            IO.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}

class ForDemo {
    public static void main(String[] args){
         for(int i = 1; i < 11; i++){
              IO.println("Count is: " + i);
         }
    }
}

class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers =
             {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         for (int item : numbers) {
             IO.println("Count is: " + item);
         }
    }
}

class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
            {  32,   87,    3, 589 },
            {  12, 1076, 2000,   8 },
            { 622,  127,   77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            IO.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            IO.println(searchfor + " not in the array");
        }
    }
}

class Test {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public int calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> 0;
                default -> {
                    int remainingWorkDays = 5 - d.ordinal();
                    yield remainingWorkDays;
                }
            };
    }
}

