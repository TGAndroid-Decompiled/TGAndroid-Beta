package wi;
public final class e0 implements Runnable {
    public final int f57866a;
    public final t0 f57867b;
    public final Exception f57868c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57866a = i7;
        this.f57867b = t0Var;
        this.f57868c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57866a) {
            case 0:
                this.f57867b.h(this.f57868c);
                return;
            case 1:
                this.f57867b.h(this.f57868c);
                return;
            case 2:
                this.f57867b.h(this.f57868c);
                return;
            default:
                this.f57867b.h(this.f57868c);
                return;
        }
    }
}
