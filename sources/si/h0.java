package si;

import org.telegram.ui.Components.d11;
public final class h0 implements Runnable {
    public final int f47048a;
    public final u0 f47049b;
    public final q0 f47050c;

    public h0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.f47048a = i11;
        this.f47049b = u0Var;
        this.f47050c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f47048a) {
            case 0:
                u0 u0Var = this.f47049b;
                q0 q0Var = this.f47050c;
                ((d11) u0Var.e).c(q0Var.f47189a);
                return;
            case 1:
                u0 u0Var2 = this.f47049b;
                q0 q0Var2 = this.f47050c;
                r0 r0Var = u0Var2.e;
                long j10 = q0Var2.f47189a;
                d11 d11Var = (d11) r0Var;
                synchronized (d11Var) {
                    d11Var.c(j10);
                }
                return;
            default:
                u0 u0Var3 = this.f47049b;
                q0 q0Var3 = this.f47050c;
                ((d11) u0Var3.e).c(q0Var3.f47189a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f47048a = 1;
        this.f47049b = u0Var;
        this.f47050c = q0Var;
    }
}
