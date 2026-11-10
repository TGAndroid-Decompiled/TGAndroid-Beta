package p4;
public final class e0 implements Runnable {
    public final int f53240a;
    public final m0 f53241b;

    public e0(m0 m0Var, int i7) {
        this.f53240a = i7;
        this.f53241b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53240a) {
            case 0:
                m0 m0Var = this.f53241b;
                h2.m0.W(m0Var.h.f53221l, new e0(m0Var, 1));
                return;
            default:
                this.f53241b.o0();
                return;
        }
    }
}
