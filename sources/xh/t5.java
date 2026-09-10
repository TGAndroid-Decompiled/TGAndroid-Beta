package xh;
public final class t5 implements Runnable {
    public final int f46062a;
    public final u5 f46063b;
    public final long f46064c;

    public t5(u5 u5Var, long j3, int i10) {
        this.f46062a = i10;
        this.f46063b = u5Var;
        this.f46064c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46062a) {
            case 0:
                u5 u5Var = this.f46063b;
                u5Var.f46153q.d0(u5Var.f46141b, u5Var.f46142c, this.f46064c, true, true, u5Var.f46150n);
                return;
            default:
                u5 u5Var2 = this.f46063b;
                u5Var2.f46153q.d0(u5Var2.f46141b, u5Var2.f46142c, this.f46064c, true, true, u5Var2.f46150n);
                return;
        }
    }
}
