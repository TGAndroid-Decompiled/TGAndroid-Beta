package qg;
public final class q0 implements Runnable {
    public final int f44640a;
    public final s0 f44641b;
    public final a5.a f44642c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44640a = i10;
        this.f44641b = s0Var;
        this.f44642c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44640a) {
            case 0:
                this.f44641b.p(this.f44642c, true);
                return;
            default:
                s0 s0Var = this.f44641b;
                s0Var.f44668f.f(new q0(s0Var, this.f44642c, 0));
                return;
        }
    }
}
