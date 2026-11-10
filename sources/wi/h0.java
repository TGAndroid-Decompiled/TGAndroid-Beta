package wi;

import org.telegram.ui.Components.hy0;
public final class h0 implements Runnable {
    public final int f57994a;
    public final t0 f57995b;
    public final p0 f57996c;

    public h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.f57994a = i10;
        this.f57995b = t0Var;
        this.f57996c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57994a) {
            case 0:
                t0 t0Var = this.f57995b;
                p0 p0Var = this.f57996c;
                ((hy0) t0Var.f58210e).c(p0Var.f58138a);
                return;
            case 1:
                t0 t0Var2 = this.f57995b;
                p0 p0Var2 = this.f57996c;
                q0 q0Var = t0Var2.f58210e;
                long j3 = p0Var2.f58138a;
                hy0 hy0Var = (hy0) q0Var;
                synchronized (hy0Var) {
                    hy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.f57995b;
                p0 p0Var3 = this.f57996c;
                ((hy0) t0Var3.f58210e).c(p0Var3.f58138a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57994a = 1;
        this.f57995b = t0Var;
        this.f57996c = p0Var;
    }
}
