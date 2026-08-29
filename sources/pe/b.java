package pe;
public final class b implements Runnable {
    public final int f45719a;
    public final Runnable f45720b;

    public b(int i10, Runnable runnable) {
        this.f45719a = i10;
        this.f45720b = runnable;
    }

    @Override
    public final void run() {
        this.f45720b.run();
    }
}
