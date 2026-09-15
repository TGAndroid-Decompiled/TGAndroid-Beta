package pg;
public final class o0 implements Runnable {
    public final int f40926a;
    public final q0 f40927b;
    public final a5.a f40928c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f40926a = i10;
        this.f40927b = q0Var;
        this.f40928c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f40926a) {
            case 0:
                this.f40927b.p(this.f40928c, true);
                return;
            default:
                q0 q0Var = this.f40927b;
                q0Var.f40951f.f(new o0(q0Var, this.f40928c, 0));
                return;
        }
    }
}
