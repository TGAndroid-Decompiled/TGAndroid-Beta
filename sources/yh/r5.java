package yh;
public final class r5 implements Runnable {
    public final int f48019a;
    public final t5 f48020b;
    public final long f48021c;

    public r5(t5 t5Var, long j3, int i10) {
        this.f48019a = i10;
        this.f48020b = t5Var;
        this.f48021c = j3;
    }

    @Override
    public final void run() {
        switch (this.f48019a) {
            case 0:
                t5 t5Var = this.f48020b;
                t5Var.f48103q.d0(t5Var.f48091b, t5Var.f48092c, this.f48021c, true, true, t5Var.f48100n);
                return;
            default:
                t5 t5Var2 = this.f48020b;
                t5Var2.f48103q.d0(t5Var2.f48091b, t5Var2.f48092c, this.f48021c, true, true, t5Var2.f48100n);
                return;
        }
    }
}
