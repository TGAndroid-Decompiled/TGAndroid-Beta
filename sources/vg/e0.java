package vg;
public final class e0 implements Runnable {
    public final int f50163a;
    public final g0 f50164b;

    public e0(g0 g0Var, int i10) {
        this.f50163a = i10;
        this.f50164b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f50163a) {
            case 0:
                g0.k0(this.f50164b);
                return;
            default:
                g0.j0(this.f50164b);
                return;
        }
    }
}
