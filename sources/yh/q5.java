package yh;
public final class q5 implements Runnable {
    public final int f51864a;
    public final s5 f51865b;
    public final long f51866c;

    public q5(s5 s5Var, long j3, int i10) {
        this.f51864a = i10;
        this.f51865b = s5Var;
        this.f51866c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51864a) {
            case 0:
                s5 s5Var = this.f51865b;
                s5Var.f51977q.d0(s5Var.f51964b, s5Var.f51965c, this.f51866c, true, true, s5Var.f51974n);
                return;
            default:
                s5 s5Var2 = this.f51865b;
                s5Var2.f51977q.d0(s5Var2.f51964b, s5Var2.f51965c, this.f51866c, true, true, s5Var2.f51974n);
                return;
        }
    }
}
