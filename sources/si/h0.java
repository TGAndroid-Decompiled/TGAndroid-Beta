package si;

import org.telegram.ui.Components.z01;
public final class h0 implements Runnable {
    public final int f46607a;
    public final s0 f46608b;
    public final o0 f46609c;

    public h0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f46607a = i11;
        this.f46608b = s0Var;
        this.f46609c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f46607a) {
            case 0:
                s0 s0Var = this.f46608b;
                o0 o0Var = this.f46609c;
                ((z01) s0Var.e).c(o0Var.f46739a);
                return;
            case 1:
                s0 s0Var2 = this.f46608b;
                o0 o0Var2 = this.f46609c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f46739a;
                z01 z01Var = (z01) p0Var;
                synchronized (z01Var) {
                    z01Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f46608b;
                o0 o0Var3 = this.f46609c;
                ((z01) s0Var3.e).c(o0Var3.f46739a);
                return;
        }
    }

    public h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f46607a = 1;
        this.f46608b = s0Var;
        this.f46609c = o0Var;
    }
}
