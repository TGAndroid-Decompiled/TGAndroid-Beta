package wi;
public final class e0 implements Runnable {
    public final int f57958a;
    public final t0 f57959b;
    public final Exception f57960c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57958a = i7;
        this.f57959b = t0Var;
        this.f57960c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57958a) {
            case 0:
                this.f57959b.h(this.f57960c);
                return;
            case 1:
                this.f57959b.h(this.f57960c);
                return;
            case 2:
                this.f57959b.h(this.f57960c);
                return;
            default:
                this.f57959b.h(this.f57960c);
                return;
        }
    }
}
