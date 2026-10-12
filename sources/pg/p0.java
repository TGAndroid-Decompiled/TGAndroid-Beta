package pg;
public final class p0 implements Runnable {
    public final int f45605a;
    public final r0 f45606b;
    public final a5.a f45607c;

    public p0(r0 r0Var, a5.a aVar, int i10) {
        this.f45605a = i10;
        this.f45606b = r0Var;
        this.f45607c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45605a) {
            case 0:
                this.f45606b.p(this.f45607c, true);
                return;
            default:
                r0 r0Var = this.f45606b;
                r0Var.f45637f.f(new p0(r0Var, this.f45607c, 0));
                return;
        }
    }
}
