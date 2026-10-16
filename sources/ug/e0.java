package ug;
public final class e0 implements Runnable {
    public final int f46303a;
    public final g0 f46304b;

    public e0(g0 g0Var, int i10) {
        this.f46303a = i10;
        this.f46304b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f46303a) {
            case 0:
                g0.f0(this.f46304b);
                return;
            default:
                g0.e0(this.f46304b);
                return;
        }
    }
}
