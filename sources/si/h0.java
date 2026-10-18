package si;

import org.telegram.ui.Components.y01;
public final class h0 implements Runnable {
    public final int f46649a;
    public final s0 f46650b;
    public final o0 f46651c;

    public h0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f46649a = i11;
        this.f46650b = s0Var;
        this.f46651c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f46649a) {
            case 0:
                s0 s0Var = this.f46650b;
                o0 o0Var = this.f46651c;
                ((y01) s0Var.e).c(o0Var.f46783a);
                return;
            case 1:
                s0 s0Var2 = this.f46650b;
                o0 o0Var2 = this.f46651c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f46783a;
                y01 y01Var = (y01) p0Var;
                synchronized (y01Var) {
                    y01Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f46650b;
                o0 o0Var3 = this.f46651c;
                ((y01) s0Var3.e).c(o0Var3.f46783a);
                return;
        }
    }

    public h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f46649a = 1;
        this.f46650b = s0Var;
        this.f46651c = o0Var;
    }
}
