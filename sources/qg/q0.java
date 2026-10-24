package qg;
public final class q0 implements Runnable {
    public final int f45018a;
    public final s0 f45019b;
    public final a5.a f45020c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45018a = i10;
        this.f45019b = s0Var;
        this.f45020c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45018a) {
            case 0:
                this.f45019b.p(this.f45020c, true);
                return;
            default:
                s0 s0Var = this.f45019b;
                s0Var.f45046f.f(new q0(s0Var, this.f45020c, 0));
                return;
        }
    }
}
