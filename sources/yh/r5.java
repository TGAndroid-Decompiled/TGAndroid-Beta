package yh;
public final class r5 implements Runnable {
    public final int f47955a;
    public final s5 f47956b;
    public final long f47957c;

    public r5(s5 s5Var, long j3, int i10) {
        this.f47955a = i10;
        this.f47956b = s5Var;
        this.f47957c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47955a) {
            case 0:
                s5 s5Var = this.f47956b;
                s5Var.f48015q.d0(s5Var.f48003b, s5Var.f48004c, this.f47957c, true, true, s5Var.f48012n);
                return;
            default:
                s5 s5Var2 = this.f47956b;
                s5Var2.f48015q.d0(s5Var2.f48003b, s5Var2.f48004c, this.f47957c, true, true, s5Var2.f48012n);
                return;
        }
    }
}
