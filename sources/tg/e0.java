package tg;
public final class e0 implements Runnable {
    public final int f48559a;
    public final g0 f48560b;

    public e0(g0 g0Var, int i10) {
        this.f48559a = i10;
        this.f48560b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f48559a) {
            case 0:
                g0.f0(this.f48560b);
                return;
            default:
                g0.e0(this.f48560b);
                return;
        }
    }
}
