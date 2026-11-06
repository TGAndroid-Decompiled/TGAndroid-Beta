package wi;
public final class e0 implements Runnable {
    public final int f57842a;
    public final t0 f57843b;
    public final Exception f57844c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57842a = i7;
        this.f57843b = t0Var;
        this.f57844c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57842a) {
            case 0:
                this.f57843b.h(this.f57844c);
                return;
            case 1:
                this.f57843b.h(this.f57844c);
                return;
            case 2:
                this.f57843b.h(this.f57844c);
                return;
            default:
                this.f57843b.h(this.f57844c);
                return;
        }
    }
}
