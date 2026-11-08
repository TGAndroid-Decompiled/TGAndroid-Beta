package wi;
public final class e0 implements Runnable {
    public final int f57959a;
    public final t0 f57960b;
    public final Exception f57961c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57959a = i7;
        this.f57960b = t0Var;
        this.f57961c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57959a) {
            case 0:
                this.f57960b.h(this.f57961c);
                return;
            case 1:
                this.f57960b.h(this.f57961c);
                return;
            case 2:
                this.f57960b.h(this.f57961c);
                return;
            default:
                this.f57960b.h(this.f57961c);
                return;
        }
    }
}
