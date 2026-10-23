package si;

import org.telegram.ui.Components.a11;
public final class h0 implements Runnable {
    public final int f46616a;
    public final s0 f46617b;
    public final o0 f46618c;

    public h0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f46616a = i11;
        this.f46617b = s0Var;
        this.f46618c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f46616a) {
            case 0:
                s0 s0Var = this.f46617b;
                o0 o0Var = this.f46618c;
                ((a11) s0Var.e).c(o0Var.f46748a);
                return;
            case 1:
                s0 s0Var2 = this.f46617b;
                o0 o0Var2 = this.f46618c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f46748a;
                a11 a11Var = (a11) p0Var;
                synchronized (a11Var) {
                    a11Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f46617b;
                o0 o0Var3 = this.f46618c;
                ((a11) s0Var3.e).c(o0Var3.f46748a);
                return;
        }
    }

    public h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f46616a = 1;
        this.f46617b = s0Var;
        this.f46618c = o0Var;
    }
}
