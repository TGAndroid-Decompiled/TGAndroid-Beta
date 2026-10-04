package yh;
public final class q5 implements Runnable {
    public final int f51865a;
    public final s5 f51866b;
    public final long f51867c;

    public q5(s5 s5Var, long j3, int i10) {
        this.f51865a = i10;
        this.f51866b = s5Var;
        this.f51867c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51865a) {
            case 0:
                s5 s5Var = this.f51866b;
                s5Var.f51978q.d0(s5Var.f51965b, s5Var.f51966c, this.f51867c, true, true, s5Var.f51975n);
                return;
            default:
                s5 s5Var2 = this.f51866b;
                s5Var2.f51978q.d0(s5Var2.f51965b, s5Var2.f51966c, this.f51867c, true, true, s5Var2.f51975n);
                return;
        }
    }
}
