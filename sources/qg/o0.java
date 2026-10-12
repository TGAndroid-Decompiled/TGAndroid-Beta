package qg;
public final class o0 implements Runnable {
    public final int f43499a;
    public final q0 f43500b;
    public final a5.a f43501c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f43499a = i10;
        this.f43500b = q0Var;
        this.f43501c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f43499a) {
            case 0:
                this.f43500b.p(this.f43501c, true);
                return;
            default:
                q0 q0Var = this.f43500b;
                q0Var.f43524f.f(new o0(q0Var, this.f43501c, 0));
                return;
        }
    }
}
