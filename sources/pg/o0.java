package pg;
public final class o0 implements Runnable {
    public final int f40922a;
    public final q0 f40923b;
    public final a5.a f40924c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f40922a = i10;
        this.f40923b = q0Var;
        this.f40924c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f40922a) {
            case 0:
                this.f40923b.p(this.f40924c, true);
                return;
            default:
                q0 q0Var = this.f40923b;
                q0Var.f40947f.f(new o0(q0Var, this.f40924c, 0));
                return;
        }
    }
}
