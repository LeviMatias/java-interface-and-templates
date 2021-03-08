package model;

public class Timer {
    long start = 0;
    long end = 0;
    boolean running = false;

    public void start(){
        running = true;
        start = System.currentTimeMillis();
    }

    public void stop(){
        running = false;
        end = System.currentTimeMillis();
    }

    public long elapsed(){
        return (running) ? (System.currentTimeMillis() - start) : (end - start);
    }

    public float elapsed_seconds(){
        return (float) (elapsed() / 1000.0);
    }
}
