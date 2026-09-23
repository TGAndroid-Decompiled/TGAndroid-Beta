package pg;
public final class p0 implements Runnable {
    public final int f40880a;
    public final r0 f40881b;
    public final a5.a f40882c;

    public p0(r0 r0Var, a5.a aVar, int i10) {
        this.f40880a = i10;
        this.f40881b = r0Var;
        this.f40882c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f40880a) {
            case 0:
                this.f40881b.p(this.f40882c, true);
                return;
            default:
                r0 r0Var = this.f40881b;
                r0Var.f40908f.f(new p0(r0Var, this.f40882c, 0));
                return;
        }
    }
}
