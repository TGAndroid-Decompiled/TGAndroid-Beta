package tg;
public final class e0 implements Runnable {
    public final int f48320a;
    public final g0 f48321b;

    public e0(g0 g0Var, int i10) {
        this.f48320a = i10;
        this.f48321b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f48320a) {
            case 0:
                g0.f0(this.f48321b);
                return;
            default:
                g0.e0(this.f48321b);
                return;
        }
    }
}
