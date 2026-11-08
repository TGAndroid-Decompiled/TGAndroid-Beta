package wi;

import org.telegram.ui.Components.hy0;
public final class h0 implements Runnable {
    public final int f57979a;
    public final t0 f57980b;
    public final p0 f57981c;

    public h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.f57979a = i10;
        this.f57980b = t0Var;
        this.f57981c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57979a) {
            case 0:
                t0 t0Var = this.f57980b;
                p0 p0Var = this.f57981c;
                ((hy0) t0Var.f58197e).c(p0Var.f58125a);
                return;
            case 1:
                t0 t0Var2 = this.f57980b;
                p0 p0Var2 = this.f57981c;
                q0 q0Var = t0Var2.f58197e;
                long j3 = p0Var2.f58125a;
                hy0 hy0Var = (hy0) q0Var;
                synchronized (hy0Var) {
                    hy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.f57980b;
                p0 p0Var3 = this.f57981c;
                ((hy0) t0Var3.f58197e).c(p0Var3.f58125a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57979a = 1;
        this.f57980b = t0Var;
        this.f57981c = p0Var;
    }
}
