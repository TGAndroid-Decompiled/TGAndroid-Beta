package zi;

import org.telegram.ui.Components.sy0;
public final class h0 implements Runnable {
    public final int f62142a;
    public final u0 f62143b;
    public final q0 f62144c;

    public h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f62142a = i10;
        this.f62143b = u0Var;
        this.f62144c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f62142a) {
            case 0:
                u0 u0Var = this.f62143b;
                q0 q0Var = this.f62144c;
                ((sy0) u0Var.f62359e).c(q0Var.f62289a);
                return;
            case 1:
                u0 u0Var2 = this.f62143b;
                q0 q0Var2 = this.f62144c;
                r0 r0Var = u0Var2.f62359e;
                long j3 = q0Var2.f62289a;
                sy0 sy0Var = (sy0) r0Var;
                synchronized (sy0Var) {
                    sy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f62143b;
                q0 q0Var3 = this.f62144c;
                ((sy0) u0Var3.f62359e).c(q0Var3.f62289a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f62142a = 1;
        this.f62143b = u0Var;
        this.f62144c = q0Var;
    }
}
