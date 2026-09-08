package qg;
public final class o0 implements Runnable {
    public final int f44522a;
    public final q0 f44523b;
    public final a5.a f44524c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f44522a = i10;
        this.f44523b = q0Var;
        this.f44524c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44522a) {
            case 0:
                this.f44523b.p(this.f44524c, true);
                return;
            default:
                q0 q0Var = this.f44523b;
                q0Var.f44550f.f(new o0(q0Var, this.f44524c, 0));
                return;
        }
    }
}
