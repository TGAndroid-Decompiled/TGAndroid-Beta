package yh;
public final class q5 implements Runnable {
    public final int f47913a;
    public final s5 f47914b;
    public final long f47915c;

    public q5(s5 s5Var, long j3, int i10) {
        this.f47913a = i10;
        this.f47914b = s5Var;
        this.f47915c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47913a) {
            case 0:
                s5 s5Var = this.f47914b;
                s5Var.f48015q.d0(s5Var.f48003b, s5Var.f48004c, this.f47915c, true, true, s5Var.f48012n);
                return;
            default:
                s5 s5Var2 = this.f47914b;
                s5Var2.f48015q.d0(s5Var2.f48003b, s5Var2.f48004c, this.f47915c, true, true, s5Var2.f48012n);
                return;
        }
    }
}
