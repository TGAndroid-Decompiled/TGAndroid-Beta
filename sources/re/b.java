package re;
public final class b implements Runnable {
    public final int f43443a;
    public final Runnable f43444b;

    public b(int i10, Runnable runnable) {
        this.f43443a = i10;
        this.f43444b = runnable;
    }

    @Override
    public final void run() {
        this.f43444b.run();
    }
}
