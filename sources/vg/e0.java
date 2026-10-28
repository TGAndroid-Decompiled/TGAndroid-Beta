package vg;
public final class e0 implements Runnable {
    public final int f50201a;
    public final g0 f50202b;

    public e0(g0 g0Var, int i10) {
        this.f50201a = i10;
        this.f50202b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f50201a) {
            case 0:
                g0.k0(this.f50202b);
                return;
            default:
                g0.j0(this.f50202b);
                return;
        }
    }
}
