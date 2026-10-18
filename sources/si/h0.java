package si;

import org.telegram.ui.Components.y01;
public final class h0 implements Runnable {
    public final int f46605a;
    public final s0 f46606b;
    public final o0 f46607c;

    public h0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f46605a = i11;
        this.f46606b = s0Var;
        this.f46607c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f46605a) {
            case 0:
                s0 s0Var = this.f46606b;
                o0 o0Var = this.f46607c;
                ((y01) s0Var.e).c(o0Var.f46737a);
                return;
            case 1:
                s0 s0Var2 = this.f46606b;
                o0 o0Var2 = this.f46607c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f46737a;
                y01 y01Var = (y01) p0Var;
                synchronized (y01Var) {
                    y01Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f46606b;
                o0 o0Var3 = this.f46607c;
                ((y01) s0Var3.e).c(o0Var3.f46737a);
                return;
        }
    }

    public h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f46605a = 1;
        this.f46606b = s0Var;
        this.f46607c = o0Var;
    }
}
