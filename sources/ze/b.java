package ze;
public final class b implements Runnable {
    public final int f55434a;
    public final Runnable f55435b;

    public b(int i10, Runnable runnable) {
        this.f55434a = i10;
        this.f55435b = runnable;
    }

    @Override
    public final void run() {
        this.f55435b.run();
    }
}
