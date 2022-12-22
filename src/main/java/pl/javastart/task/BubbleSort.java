package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int counter = 0;
        int n = inputArray.length;

        do {
            boolean swaped = false;
            for (int i = 0; i < n - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int prevNo = inputArray[i];
                    int nextNo = inputArray[i + 1];

                    inputArray[i] = nextNo;
                    inputArray[i + 1] = prevNo;
                    swaped = true;
                }
                counter += 1;
            }
            if (swaped) {
                n = n - 1;
            } else {
                n = 1;
            }

        } while (n > 1);

        return counter;
    }
}
