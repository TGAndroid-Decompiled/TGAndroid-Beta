package yh;
public final class q5 implements Runnable {
    public final int f47910a;
    public final r5 f47911b;
    public final long f47912c;

    public q5(r5 r5Var, long j3, int i10) {
        this.f47910a = i10;
        this.f47911b = r5Var;
        this.f47912c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47910a) {
            case 0:
                r5 r5Var = this.f47911b;
                r5Var.f47968q.d0(r5Var.f47956b, r5Var.f47957c, this.f47912c, true, true, r5Var.f47965n);
                return;
            default:
                r5 r5Var2 = this.f47911b;
                r5Var2.f47968q.d0(r5Var2.f47956b, r5Var2.f47957c, this.f47912c, true, true, r5Var2.f47965n);
                return;
        }
    }
}
