package p4;
public final class e0 implements Runnable {
    public final int f55207a;
    public final m0 f55208b;

    public e0(m0 m0Var, int i7) {
        this.f55207a = i7;
        this.f55208b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f55207a) {
            case 0:
                m0 m0Var = this.f55208b;
                h2.l0.W(m0Var.h.f55187l, new e0(m0Var, 1));
                return;
            default:
                this.f55208b.o0();
                return;
        }
    }
}
