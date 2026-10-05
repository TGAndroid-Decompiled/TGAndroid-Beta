package yh;
public final class r5 implements Runnable {
    public final int f51924a;
    public final t5 f51925b;
    public final long f51926c;

    public r5(t5 t5Var, long j3, int i10) {
        this.f51924a = i10;
        this.f51925b = t5Var;
        this.f51926c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51924a) {
            case 0:
                t5 t5Var = this.f51925b;
                t5Var.f52035q.d0(t5Var.f52022b, t5Var.f52023c, this.f51926c, true, true, t5Var.f52032n);
                return;
            default:
                t5 t5Var2 = this.f51925b;
                t5Var2.f52035q.d0(t5Var2.f52022b, t5Var2.f52023c, this.f51926c, true, true, t5Var2.f52032n);
                return;
        }
    }
}
