package zi;

import org.telegram.ui.Components.ry0;
public final class h0 implements Runnable {
    public final int f62225a;
    public final u0 f62226b;
    public final q0 f62227c;

    public h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f62225a = i10;
        this.f62226b = u0Var;
        this.f62227c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f62225a) {
            case 0:
                u0 u0Var = this.f62226b;
                q0 q0Var = this.f62227c;
                ((ry0) u0Var.f62444e).c(q0Var.f62374a);
                return;
            case 1:
                u0 u0Var2 = this.f62226b;
                q0 q0Var2 = this.f62227c;
                r0 r0Var = u0Var2.f62444e;
                long j3 = q0Var2.f62374a;
                ry0 ry0Var = (ry0) r0Var;
                synchronized (ry0Var) {
                    ry0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f62226b;
                q0 q0Var3 = this.f62227c;
                ((ry0) u0Var3.f62444e).c(q0Var3.f62374a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f62225a = 1;
        this.f62226b = u0Var;
        this.f62227c = q0Var;
    }
}
