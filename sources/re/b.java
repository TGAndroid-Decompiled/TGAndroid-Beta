package re;
public final class b implements Runnable {
    public final int f43467a;
    public final Runnable f43468b;

    public b(int i10, Runnable runnable) {
        this.f43467a = i10;
        this.f43468b = runnable;
    }

    @Override
    public final void run() {
        this.f43468b.run();
    }
}
