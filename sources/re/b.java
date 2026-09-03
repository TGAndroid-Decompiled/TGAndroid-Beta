package re;
public final class b implements Runnable {
    public final int f46830a;
    public final Runnable f46831b;

    public b(int i10, Runnable runnable) {
        this.f46830a = i10;
        this.f46831b = runnable;
    }

    @Override
    public final void run() {
        this.f46831b.run();
    }
}
