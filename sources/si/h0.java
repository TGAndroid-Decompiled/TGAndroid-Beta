package si;

import org.telegram.ui.Components.a11;
public final class h0 implements Runnable {
    public final int f46615a;
    public final s0 f46616b;
    public final o0 f46617c;

    public h0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f46615a = i11;
        this.f46616b = s0Var;
        this.f46617c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f46615a) {
            case 0:
                s0 s0Var = this.f46616b;
                o0 o0Var = this.f46617c;
                ((a11) s0Var.e).c(o0Var.f46747a);
                return;
            case 1:
                s0 s0Var2 = this.f46616b;
                o0 o0Var2 = this.f46617c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f46747a;
                a11 a11Var = (a11) p0Var;
                synchronized (a11Var) {
                    a11Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f46616b;
                o0 o0Var3 = this.f46617c;
                ((a11) s0Var3.e).c(o0Var3.f46747a);
                return;
        }
    }

    public h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f46615a = 1;
        this.f46616b = s0Var;
        this.f46617c = o0Var;
    }
}
