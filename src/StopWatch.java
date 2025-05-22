//Summer 2023 Q:2(c)

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch timer = new StopWatch();

        // Simulate starting and stopping without exceptions
        timer.start();

        // Simulate some processing (without using Thread.sleep())
        // (This is just a placeholder for manual timing)

        timer.stop();
        System.out.println("Elapsed time: " + timer.getElapsedTime() + " ms");

        // Restart demonstration
        timer.start();
        // Simulate another task (manually)
        timer.stop();
        System.out.println("Second elapsed time: " + timer.getElapsedTime() + " ms");
    }
}