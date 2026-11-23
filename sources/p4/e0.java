package p4;
public final class e0 implements Runnable {
    public final int f55339a;
    public final n0 f55340b;

    public e0(n0 n0Var, int i7) {
        this.f55339a = i7;
        this.f55340b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f55339a) {
            case 0:
                n0 n0Var = this.f55340b;
                h2.l0.W(n0Var.h.f55316l, new e0(n0Var, 1));
                return;
            default:
                this.f55340b.o0();
                return;
        }
    }
}
