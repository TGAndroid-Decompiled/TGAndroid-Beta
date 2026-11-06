package p4;
public final class e0 implements Runnable {
    public final int f53137a;
    public final m0 f53138b;

    public e0(m0 m0Var, int i7) {
        this.f53137a = i7;
        this.f53138b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53137a) {
            case 0:
                m0 m0Var = this.f53138b;
                h2.m0.W(m0Var.h.f53118l, new e0(m0Var, 1));
                return;
            default:
                this.f53138b.o0();
                return;
        }
    }
}
