package wi;

import org.telegram.ui.Components.iy0;
public final class h0 implements Runnable {
    public final int f57990a;
    public final t0 f57991b;
    public final p0 f57992c;

    public h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.f57990a = i10;
        this.f57991b = t0Var;
        this.f57992c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57990a) {
            case 0:
                t0 t0Var = this.f57991b;
                p0 p0Var = this.f57992c;
                ((iy0) t0Var.f58206e).c(p0Var.f58134a);
                return;
            case 1:
                t0 t0Var2 = this.f57991b;
                p0 p0Var2 = this.f57992c;
                q0 q0Var = t0Var2.f58206e;
                long j3 = p0Var2.f58134a;
                iy0 iy0Var = (iy0) q0Var;
                synchronized (iy0Var) {
                    iy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.f57991b;
                p0 p0Var3 = this.f57992c;
                ((iy0) t0Var3.f58206e).c(p0Var3.f58134a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57990a = 1;
        this.f57991b = t0Var;
        this.f57992c = p0Var;
    }
}
