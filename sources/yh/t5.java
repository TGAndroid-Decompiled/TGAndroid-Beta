package yh;
public final class t5 implements Runnable {
    public final int f47851a;
    public final u5 f47852b;
    public final long f47853c;

    public t5(u5 u5Var, long j3, int i10) {
        this.f47851a = i10;
        this.f47852b = u5Var;
        this.f47853c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47851a) {
            case 0:
                u5 u5Var = this.f47852b;
                u5Var.f47895q.d0(u5Var.f47883b, u5Var.f47884c, this.f47853c, true, true, u5Var.f47892n);
                return;
            default:
                u5 u5Var2 = this.f47852b;
                u5Var2.f47895q.d0(u5Var2.f47883b, u5Var2.f47884c, this.f47853c, true, true, u5Var2.f47892n);
                return;
        }
    }
}
