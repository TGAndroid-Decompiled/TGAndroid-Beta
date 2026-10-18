package qg;
public final class q0 implements Runnable {
    public final int f44594a;
    public final s0 f44595b;
    public final a5.a f44596c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44594a = i10;
        this.f44595b = s0Var;
        this.f44596c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44594a) {
            case 0:
                this.f44595b.p(this.f44596c, true);
                return;
            default:
                s0 s0Var = this.f44595b;
                s0Var.f44626f.f(new q0(s0Var, this.f44596c, 0));
                return;
        }
    }
}
