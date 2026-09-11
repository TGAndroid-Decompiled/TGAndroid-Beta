package qg;
public final class o0 implements Runnable {
    public final int f44494a;
    public final q0 f44495b;
    public final a5.a f44496c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f44494a = i10;
        this.f44495b = q0Var;
        this.f44496c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44494a) {
            case 0:
                this.f44495b.p(this.f44496c, true);
                return;
            default:
                q0 q0Var = this.f44495b;
                q0Var.f44522f.f(new o0(q0Var, this.f44496c, 0));
                return;
        }
    }
}
