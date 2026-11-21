package zi;

import org.telegram.ui.Components.sy0;
public final class h0 implements Runnable {
    public final int f62138a;
    public final u0 f62139b;
    public final q0 f62140c;

    public h0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f62138a = i10;
        this.f62139b = u0Var;
        this.f62140c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f62138a) {
            case 0:
                u0 u0Var = this.f62139b;
                q0 q0Var = this.f62140c;
                ((sy0) u0Var.f62355e).c(q0Var.f62285a);
                return;
            case 1:
                u0 u0Var2 = this.f62139b;
                q0 q0Var2 = this.f62140c;
                r0 r0Var = u0Var2.f62355e;
                long j3 = q0Var2.f62285a;
                sy0 sy0Var = (sy0) r0Var;
                synchronized (sy0Var) {
                    sy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f62139b;
                q0 q0Var3 = this.f62140c;
                ((sy0) u0Var3.f62355e).c(q0Var3.f62285a);
                return;
        }
    }

    public h0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f62138a = 1;
        this.f62139b = u0Var;
        this.f62140c = q0Var;
    }
}
