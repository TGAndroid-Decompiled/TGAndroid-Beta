package p4;
public final class e0 implements Runnable {
    public final int f53111a;
    public final m0 f53112b;

    public e0(m0 m0Var, int i7) {
        this.f53111a = i7;
        this.f53112b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53111a) {
            case 0:
                m0 m0Var = this.f53112b;
                h2.m0.W(m0Var.h.f53092l, new e0(m0Var, 1));
                return;
            default:
                this.f53112b.o0();
                return;
        }
    }
}
