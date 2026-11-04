package wi;

import org.telegram.ui.Components.gy0;
public final class g0 implements Runnable {
    public final int f57837a;
    public final t0 f57838b;
    public final p0 f57839c;

    public g0(t0 t0Var, p0 p0Var, int i3, int i10) {
        this.f57837a = i10;
        this.f57838b = t0Var;
        this.f57839c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57837a) {
            case 0:
                t0 t0Var = this.f57838b;
                p0 p0Var = this.f57839c;
                ((gy0) t0Var.f58057e).c(p0Var.f57992a);
                return;
            case 1:
                t0 t0Var2 = this.f57838b;
                p0 p0Var2 = this.f57839c;
                q0 q0Var = t0Var2.f58057e;
                long j10 = p0Var2.f57992a;
                gy0 gy0Var = (gy0) q0Var;
                synchronized (gy0Var) {
                    gy0Var.c(j10);
                }
                return;
            default:
                t0 t0Var3 = this.f57838b;
                p0 p0Var3 = this.f57839c;
                ((gy0) t0Var3.f58057e).c(p0Var3.f57992a);
                return;
        }
    }

    public g0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57837a = 1;
        this.f57838b = t0Var;
        this.f57839c = p0Var;
    }
}
