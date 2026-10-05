package pg;
public final class q0 implements Runnable {
    public final int f44575a;
    public final s0 f44576b;
    public final a5.a f44577c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44575a = i10;
        this.f44576b = s0Var;
        this.f44577c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44575a) {
            case 0:
                this.f44576b.p(this.f44577c, true);
                return;
            default:
                s0 s0Var = this.f44576b;
                s0Var.f44601f.f(new q0(s0Var, this.f44577c, 0));
                return;
        }
    }
}
