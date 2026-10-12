package pg;
public final class p0 implements Runnable {
    public final int f45600a;
    public final r0 f45601b;
    public final a5.a f45602c;

    public p0(r0 r0Var, a5.a aVar, int i10) {
        this.f45600a = i10;
        this.f45601b = r0Var;
        this.f45602c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45600a) {
            case 0:
                this.f45601b.p(this.f45602c, true);
                return;
            default:
                r0 r0Var = this.f45601b;
                r0Var.f45632f.f(new p0(r0Var, this.f45602c, 0));
                return;
        }
    }
}
