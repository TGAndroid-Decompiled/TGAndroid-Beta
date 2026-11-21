package p4;
public final class f0 implements Runnable {
    public final int f55259a;
    public final n0 f55260b;

    public f0(n0 n0Var, int i7) {
        this.f55259a = i7;
        this.f55260b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f55259a) {
            case 0:
                n0 n0Var = this.f55260b;
                h2.l0.W(n0Var.h.f55237l, new f0(n0Var, 1));
                return;
            default:
                this.f55260b.o0();
                return;
        }
    }
}
