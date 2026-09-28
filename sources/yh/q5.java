package yh;
public final class q5 implements Runnable {
    public final int f47912a;
    public final r5 f47913b;
    public final long f47914c;

    public q5(r5 r5Var, long j3, int i10) {
        this.f47912a = i10;
        this.f47913b = r5Var;
        this.f47914c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47912a) {
            case 0:
                r5 r5Var = this.f47913b;
                r5Var.f47970q.d0(r5Var.f47958b, r5Var.f47959c, this.f47914c, true, true, r5Var.f47967n);
                return;
            default:
                r5 r5Var2 = this.f47913b;
                r5Var2.f47970q.d0(r5Var2.f47958b, r5Var2.f47959c, this.f47914c, true, true, r5Var2.f47967n);
                return;
        }
    }
}
