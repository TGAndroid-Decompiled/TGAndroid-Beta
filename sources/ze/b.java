package ze;
public final class b implements Runnable {
    public final int f55452a;
    public final Runnable f55453b;

    public b(int i10, Runnable runnable) {
        this.f55452a = i10;
        this.f55453b = runnable;
    }

    @Override
    public final void run() {
        this.f55453b.run();
    }
}
