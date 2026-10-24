package si;

import org.telegram.ui.Components.c11;
public final class h0 implements Runnable {
    public final int f47047a;
    public final u0 f47048b;
    public final q0 f47049c;

    public h0(u0 u0Var, q0 q0Var, int i10, int i11) {
        this.f47047a = i11;
        this.f47048b = u0Var;
        this.f47049c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f47047a) {
            case 0:
                u0 u0Var = this.f47048b;
                q0 q0Var = this.f47049c;
                ((c11) u0Var.e).c(q0Var.f47188a);
                return;
            case 1:
                u0 u0Var2 = this.f47048b;
                q0 q0Var2 = this.f47049c;
                r0 r0Var = u0Var2.e;
                long j10 = q0Var2.f47188a;
                c11 c11Var = (c11) r0Var;
                synchronized (c11Var) {
                    c11Var.c(j10);
                }
                return;
            default:
                u0 u0Var3 = this.f47048b;
                q0 q0Var3 = this.f47049c;
                ((c11) u0Var3.e).c(q0Var3.f47188a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f47047a = 1;
        this.f47048b = u0Var;
        this.f47049c = q0Var;
    }
}
