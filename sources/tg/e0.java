package tg;
public final class e0 implements Runnable {
    public final int f43417a;
    public final g0 f43418b;

    public e0(g0 g0Var, int i10) {
        this.f43417a = i10;
        this.f43418b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f43417a) {
            case 0:
                g0.e0(this.f43418b);
                return;
            default:
                g0.d0(this.f43418b);
                return;
        }
    }
}
