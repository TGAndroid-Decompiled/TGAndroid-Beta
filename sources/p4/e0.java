package p4;
public final class e0 implements Runnable {
    public final int f55217a;
    public final m0 f55218b;

    public e0(m0 m0Var, int i7) {
        this.f55217a = i7;
        this.f55218b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f55217a) {
            case 0:
                m0 m0Var = this.f55218b;
                h2.l0.W(m0Var.h.f55197l, new e0(m0Var, 1));
                return;
            default:
                this.f55218b.o0();
                return;
        }
    }
}
