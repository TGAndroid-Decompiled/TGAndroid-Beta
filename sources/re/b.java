package re;
public final class b implements Runnable {
    public final int f46799a;
    public final Runnable f46800b;

    public b(int i10, Runnable runnable) {
        this.f46799a = i10;
        this.f46800b = runnable;
    }

    @Override
    public final void run() {
        this.f46800b.run();
    }
}
