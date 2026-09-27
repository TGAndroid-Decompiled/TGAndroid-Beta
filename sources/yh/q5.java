package yh;
public final class q5 implements Runnable {
    public final int f47973a;
    public final r5 f47974b;
    public final long f47975c;

    public q5(r5 r5Var, long j3, int i10) {
        this.f47973a = i10;
        this.f47974b = r5Var;
        this.f47975c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47973a) {
            case 0:
                r5 r5Var = this.f47974b;
                r5Var.f48017q.d0(r5Var.f48005b, r5Var.f48006c, this.f47975c, true, true, r5Var.f48014n);
                return;
            default:
                r5 r5Var2 = this.f47974b;
                r5Var2.f48017q.d0(r5Var2.f48005b, r5Var2.f48006c, this.f47975c, true, true, r5Var2.f48014n);
                return;
        }
    }
}
