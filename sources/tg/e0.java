package tg;
public final class e0 implements Runnable {
    public final int f47019a;
    public final g0 f47020b;

    public e0(g0 g0Var, int i10) {
        this.f47019a = i10;
        this.f47020b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f47019a) {
            case 0:
                g0.e0(this.f47020b);
                return;
            default:
                g0.d0(this.f47020b);
                return;
        }
    }
}
