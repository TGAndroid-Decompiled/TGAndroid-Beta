package qg;
public final class o0 implements Runnable {
    public final int f44523a;
    public final q0 f44524b;
    public final a5.a f44525c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f44523a = i10;
        this.f44524b = q0Var;
        this.f44525c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44523a) {
            case 0:
                this.f44524b.p(this.f44525c, true);
                return;
            default:
                q0 q0Var = this.f44524b;
                q0Var.f44551f.f(new o0(q0Var, this.f44525c, 0));
                return;
        }
    }
}
