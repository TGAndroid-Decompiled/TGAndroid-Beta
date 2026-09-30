package yh;
public final class q5 implements Runnable {
    public final int f48019a;
    public final r5 f48020b;
    public final long f48021c;

    public q5(r5 r5Var, long j3, int i10) {
        this.f48019a = i10;
        this.f48020b = r5Var;
        this.f48021c = j3;
    }

    @Override
    public final void run() {
        switch (this.f48019a) {
            case 0:
                r5 r5Var = this.f48020b;
                r5Var.f48077q.d0(r5Var.f48065b, r5Var.f48066c, this.f48021c, true, true, r5Var.f48074n);
                return;
            default:
                r5 r5Var2 = this.f48020b;
                r5Var2.f48077q.d0(r5Var2.f48065b, r5Var2.f48066c, this.f48021c, true, true, r5Var2.f48074n);
                return;
        }
    }
}
