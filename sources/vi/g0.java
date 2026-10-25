package vi;

import org.telegram.ui.Components.l11;
public final class g0 implements Runnable {
    public final int f50380a;
    public final s0 f50381b;
    public final o0 f50382c;

    public g0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.f50380a = i11;
        this.f50381b = s0Var;
        this.f50382c = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f50380a) {
            case 0:
                s0 s0Var = this.f50381b;
                o0 o0Var = this.f50382c;
                ((l11) s0Var.e).c(o0Var.f50519a);
                return;
            case 1:
                s0 s0Var2 = this.f50381b;
                o0 o0Var2 = this.f50382c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.f50519a;
                l11 l11Var = (l11) p0Var;
                synchronized (l11Var) {
                    l11Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.f50381b;
                o0 o0Var3 = this.f50382c;
                ((l11) s0Var3.e).c(o0Var3.f50519a);
                return;
        }
    }

    public g0(s0 s0Var, o0 o0Var, Exception exc) {
        this.f50380a = 1;
        this.f50381b = s0Var;
        this.f50382c = o0Var;
    }
}
