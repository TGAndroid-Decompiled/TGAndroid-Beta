package yh;
public final class t5 implements Runnable {
    public final int f47828a;
    public final u5 f47829b;
    public final long f47830c;

    public t5(u5 u5Var, long j3, int i10) {
        this.f47828a = i10;
        this.f47829b = u5Var;
        this.f47830c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47828a) {
            case 0:
                u5 u5Var = this.f47829b;
                u5Var.f47872q.d0(u5Var.f47860b, u5Var.f47861c, this.f47830c, true, true, u5Var.f47869n);
                return;
            default:
                u5 u5Var2 = this.f47829b;
                u5Var2.f47872q.d0(u5Var2.f47860b, u5Var2.f47861c, this.f47830c, true, true, u5Var2.f47869n);
                return;
        }
    }
}
