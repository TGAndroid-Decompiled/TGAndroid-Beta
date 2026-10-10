package pg;
public final class q0 implements Runnable {
    public final int f45766a;
    public final s0 f45767b;
    public final a5.a f45768c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45766a = i10;
        this.f45767b = s0Var;
        this.f45768c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45766a) {
            case 0:
                this.f45767b.p(this.f45768c, true);
                return;
            default:
                s0 s0Var = this.f45767b;
                s0Var.f45803f.f(new q0(s0Var, this.f45768c, 0));
                return;
        }
    }
}
