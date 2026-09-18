package yh;
public final class t5 implements Runnable {
    public final int f47856a;
    public final u5 f47857b;
    public final long f47858c;

    public t5(u5 u5Var, long j3, int i10) {
        this.f47856a = i10;
        this.f47857b = u5Var;
        this.f47858c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47856a) {
            case 0:
                u5 u5Var = this.f47857b;
                u5Var.f47900q.d0(u5Var.f47888b, u5Var.f47889c, this.f47858c, true, true, u5Var.f47897n);
                return;
            default:
                u5 u5Var2 = this.f47857b;
                u5Var2.f47900q.d0(u5Var2.f47888b, u5Var2.f47889c, this.f47858c, true, true, u5Var2.f47897n);
                return;
        }
    }
}
