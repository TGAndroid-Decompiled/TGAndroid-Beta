package pg;
public final class q0 implements Runnable {
    public final int f45790a;
    public final s0 f45791b;
    public final a5.a f45792c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45790a = i10;
        this.f45791b = s0Var;
        this.f45792c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45790a) {
            case 0:
                this.f45791b.p(this.f45792c, true);
                return;
            default:
                s0 s0Var = this.f45791b;
                s0Var.f45827f.f(new q0(s0Var, this.f45792c, 0));
                return;
        }
    }
}
