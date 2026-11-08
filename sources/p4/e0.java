package p4;
public final class e0 implements Runnable {
    public final int f53229a;
    public final m0 f53230b;

    public e0(m0 m0Var, int i7) {
        this.f53229a = i7;
        this.f53230b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53229a) {
            case 0:
                m0 m0Var = this.f53230b;
                h2.m0.W(m0Var.h.f53210l, new e0(m0Var, 1));
                return;
            default:
                this.f53230b.o0();
                return;
        }
    }
}
