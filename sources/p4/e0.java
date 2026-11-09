package p4;
public final class e0 implements Runnable {
    public final int f53241a;
    public final m0 f53242b;

    public e0(m0 m0Var, int i7) {
        this.f53241a = i7;
        this.f53242b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53241a) {
            case 0:
                m0 m0Var = this.f53242b;
                h2.m0.W(m0Var.h.f53222l, new e0(m0Var, 1));
                return;
            default:
                this.f53242b.o0();
                return;
        }
    }
}
