package zi;

import org.telegram.ui.Components.qy0;
public final class h0 implements Runnable {
    public final int f62097a;
    public final u0 f62098b;
    public final q0 f62099c;

    public h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f62097a = i10;
        this.f62098b = u0Var;
        this.f62099c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f62097a) {
            case 0:
                u0 u0Var = this.f62098b;
                q0 q0Var = this.f62099c;
                ((qy0) u0Var.f62314e).c(q0Var.f62244a);
                return;
            case 1:
                u0 u0Var2 = this.f62098b;
                q0 q0Var2 = this.f62099c;
                r0 r0Var = u0Var2.f62314e;
                long j3 = q0Var2.f62244a;
                qy0 qy0Var = (qy0) r0Var;
                synchronized (qy0Var) {
                    qy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f62098b;
                q0 q0Var3 = this.f62099c;
                ((qy0) u0Var3.f62314e).c(q0Var3.f62244a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f62097a = 1;
        this.f62098b = u0Var;
        this.f62099c = q0Var;
    }
}
