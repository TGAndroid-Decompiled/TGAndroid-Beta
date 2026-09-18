package pg;
public final class o0 implements Runnable {
    public final int f40953a;
    public final q0 f40954b;
    public final a5.a f40955c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f40953a = i10;
        this.f40954b = q0Var;
        this.f40955c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f40953a) {
            case 0:
                this.f40954b.p(this.f40955c, true);
                return;
            default:
                q0 q0Var = this.f40954b;
                q0Var.f40978f.f(new o0(q0Var, this.f40955c, 0));
                return;
        }
    }
}
