package pg;
public final class q0 implements Runnable {
    public final int f45756a;
    public final s0 f45757b;
    public final a5.a f45758c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45756a = i10;
        this.f45757b = s0Var;
        this.f45758c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45756a) {
            case 0:
                this.f45757b.p(this.f45758c, true);
                return;
            default:
                s0 s0Var = this.f45757b;
                s0Var.f45793f.f(new q0(s0Var, this.f45758c, 0));
                return;
        }
    }
}
