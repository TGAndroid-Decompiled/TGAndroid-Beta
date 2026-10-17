package qg;
public final class q0 implements Runnable {
    public final int f44620a;
    public final s0 f44621b;
    public final a5.a f44622c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44620a = i10;
        this.f44621b = s0Var;
        this.f44622c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44620a) {
            case 0:
                this.f44621b.p(this.f44622c, true);
                return;
            default:
                s0 s0Var = this.f44621b;
                s0Var.f44648f.f(new q0(s0Var, this.f44622c, 0));
                return;
        }
    }
}
