package zi;

import org.telegram.ui.Components.sy0;
public final class h0 implements Runnable {
    public final int f62107a;
    public final u0 f62108b;
    public final q0 f62109c;

    public h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f62107a = i10;
        this.f62108b = u0Var;
        this.f62109c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f62107a) {
            case 0:
                u0 u0Var = this.f62108b;
                q0 q0Var = this.f62109c;
                ((sy0) u0Var.f62324e).c(q0Var.f62254a);
                return;
            case 1:
                u0 u0Var2 = this.f62108b;
                q0 q0Var2 = this.f62109c;
                r0 r0Var = u0Var2.f62324e;
                long j3 = q0Var2.f62254a;
                sy0 sy0Var = (sy0) r0Var;
                synchronized (sy0Var) {
                    sy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f62108b;
                q0 q0Var3 = this.f62109c;
                ((sy0) u0Var3.f62324e).c(q0Var3.f62254a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f62107a = 1;
        this.f62108b = u0Var;
        this.f62109c = q0Var;
    }
}
