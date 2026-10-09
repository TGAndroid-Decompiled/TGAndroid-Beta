package yh;
public final class k5 implements Runnable {
    public final int f52785a;
    public final l5 f52786b;
    public final long f52787c;

    public k5(l5 l5Var, long j3, int i10) {
        this.f52785a = i10;
        this.f52786b = l5Var;
        this.f52787c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52785a) {
            case 0:
                l5 l5Var = this.f52786b;
                l5Var.f52849q.d0(l5Var.f52836b, l5Var.f52837c, this.f52787c, true, true, l5Var.f52846n);
                return;
            default:
                l5 l5Var2 = this.f52786b;
                l5Var2.f52849q.d0(l5Var2.f52836b, l5Var2.f52837c, this.f52787c, true, true, l5Var2.f52846n);
                return;
        }
    }
}
