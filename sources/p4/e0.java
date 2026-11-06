package p4;
public final class e0 implements Runnable {
    public final int f53135a;
    public final m0 f53136b;

    public e0(m0 m0Var, int i7) {
        this.f53135a = i7;
        this.f53136b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53135a) {
            case 0:
                m0 m0Var = this.f53136b;
                h2.m0.W(m0Var.h.f53116l, new e0(m0Var, 1));
                return;
            default:
                this.f53136b.o0();
                return;
        }
    }
}
