package tg;
public final class e0 implements Runnable {
    public final int f43405a;
    public final g0 f43406b;

    public e0(g0 g0Var, int i10) {
        this.f43405a = i10;
        this.f43406b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f43405a) {
            case 0:
                g0.e0(this.f43406b);
                return;
            default:
                g0.d0(this.f43406b);
                return;
        }
    }
}
