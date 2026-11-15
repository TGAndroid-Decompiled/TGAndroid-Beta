package p4;
public final class e0 implements Runnable {
    public final int f54646a;
    public final m0 f54647b;

    public e0(m0 m0Var, int i7) {
        this.f54646a = i7;
        this.f54647b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f54646a) {
            case 0:
                m0 m0Var = this.f54647b;
                h2.l0.W(m0Var.h.f54627l, new e0(m0Var, 1));
                return;
            default:
                this.f54647b.o0();
                return;
        }
    }
}
