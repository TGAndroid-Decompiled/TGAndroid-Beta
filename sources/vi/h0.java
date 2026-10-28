package vi;

import org.telegram.ui.Components.m11;
public final class h0 implements Runnable {
    public final int f50426a;
    public final u0 f50427b;
    public final q0 f50428c;

    public h0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.f50426a = i11;
        this.f50427b = u0Var;
        this.f50428c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f50426a) {
            case 0:
                u0 u0Var = this.f50427b;
                q0 q0Var = this.f50428c;
                ((m11) u0Var.e).c(q0Var.f50574a);
                return;
            case 1:
                u0 u0Var2 = this.f50427b;
                q0 q0Var2 = this.f50428c;
                r0 r0Var = u0Var2.e;
                long j10 = q0Var2.f50574a;
                m11 m11Var = (m11) r0Var;
                synchronized (m11Var) {
                    m11Var.c(j10);
                }
                return;
            default:
                u0 u0Var3 = this.f50427b;
                q0 q0Var3 = this.f50428c;
                ((m11) u0Var3.e).c(q0Var3.f50574a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f50426a = 1;
        this.f50427b = u0Var;
        this.f50428c = q0Var;
    }
}
