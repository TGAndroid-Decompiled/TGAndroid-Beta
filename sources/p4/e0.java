package p4;
public final class e0 implements Runnable {
    public final int f53228a;
    public final m0 f53229b;

    public e0(m0 m0Var, int i7) {
        this.f53228a = i7;
        this.f53229b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f53228a) {
            case 0:
                m0 m0Var = this.f53229b;
                h2.m0.W(m0Var.h.f53209l, new e0(m0Var, 1));
                return;
            default:
                this.f53229b.o0();
                return;
        }
    }
}
