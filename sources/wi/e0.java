package wi;
public final class e0 implements Runnable {
    public final int f57971a;
    public final t0 f57972b;
    public final Exception f57973c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57971a = i7;
        this.f57972b = t0Var;
        this.f57973c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57971a) {
            case 0:
                this.f57972b.h(this.f57973c);
                return;
            case 1:
                this.f57972b.h(this.f57973c);
                return;
            case 2:
                this.f57972b.h(this.f57973c);
                return;
            default:
                this.f57972b.h(this.f57973c);
                return;
        }
    }
}
