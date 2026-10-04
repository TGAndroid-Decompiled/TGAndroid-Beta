package tg;
public final class e0 implements Runnable {
    public final int f47012a;
    public final g0 f47013b;

    public e0(g0 g0Var, int i10) {
        this.f47012a = i10;
        this.f47013b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f47012a) {
            case 0:
                g0.e0(this.f47013b);
                return;
            default:
                g0.d0(this.f47013b);
                return;
        }
    }
}
