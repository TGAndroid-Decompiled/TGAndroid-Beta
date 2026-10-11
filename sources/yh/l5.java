package yh;
public final class l5 implements Runnable {
    public final int f52956a;
    public final m5 f52957b;
    public final long f52958c;

    public l5(m5 m5Var, long j3, int i10) {
        this.f52956a = i10;
        this.f52957b = m5Var;
        this.f52958c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52956a) {
            case 0:
                m5 m5Var = this.f52957b;
                m5Var.f53003q.d0(m5Var.f52990b, m5Var.f52991c, this.f52958c, true, true, m5Var.f53000n);
                return;
            default:
                m5 m5Var2 = this.f52957b;
                m5Var2.f53003q.d0(m5Var2.f52990b, m5Var2.f52991c, this.f52958c, true, true, m5Var2.f53000n);
                return;
        }
    }
}
