package ug;
public final class e0 implements Runnable {
    public final int f46304a;
    public final g0 f46305b;

    public e0(g0 g0Var, int i10) {
        this.f46304a = i10;
        this.f46305b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f46304a) {
            case 0:
                g0.f0(this.f46305b);
                return;
            default:
                g0.e0(this.f46305b);
                return;
        }
    }
}
