package yh;
public final class k5 implements Runnable {
    public final int f52829a;
    public final l5 f52830b;
    public final long f52831c;

    public k5(l5 l5Var, long j3, int i10) {
        this.f52829a = i10;
        this.f52830b = l5Var;
        this.f52831c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52829a) {
            case 0:
                l5 l5Var = this.f52830b;
                l5Var.f52893q.d0(l5Var.f52880b, l5Var.f52881c, this.f52831c, true, true, l5Var.f52890n);
                return;
            default:
                l5 l5Var2 = this.f52830b;
                l5Var2.f52893q.d0(l5Var2.f52880b, l5Var2.f52881c, this.f52831c, true, true, l5Var2.f52890n);
                return;
        }
    }
}
