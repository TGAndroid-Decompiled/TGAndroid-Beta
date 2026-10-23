package qg;
public final class q0 implements Runnable {
    public final int f45019a;
    public final s0 f45020b;
    public final a5.a f45021c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45019a = i10;
        this.f45020b = s0Var;
        this.f45021c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45019a) {
            case 0:
                this.f45020b.p(this.f45021c, true);
                return;
            default:
                s0 s0Var = this.f45020b;
                s0Var.f45047f.f(new q0(s0Var, this.f45021c, 0));
                return;
        }
    }
}
