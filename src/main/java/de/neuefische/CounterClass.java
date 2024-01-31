package de.neuefische;

public class CounterClass {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public CounterClass(){
    }

    public CounterClass(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    // Step 5
    @Override
    public String toString() {
        return "CounterClass{\n" +
                "instanceCount = " + instanceCount + "\n" +
                "totalCount = " + totalCount +
                "\n}";
    }

    // STEP 2
    static void incrementTotalCount(){
        totalCount++;
    }

    // STEP 3
    public void incrementInstanceCount(){
        instanceCount++;
    }
}
