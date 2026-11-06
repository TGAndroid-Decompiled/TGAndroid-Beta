package wi;

import org.telegram.ui.Components.gy0;
public final class h0 implements Runnable {
    public final int f57862a;
    public final t0 f57863b;
    public final p0 f57864c;

    public h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.f57862a = i10;
        this.f57863b = t0Var;
        this.f57864c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57862a) {
            case 0:
                t0 t0Var = this.f57863b;
                p0 p0Var = this.f57864c;
                ((gy0) t0Var.f58077e).c(p0Var.f58009a);
                return;
            case 1:
                t0 t0Var2 = this.f57863b;
                p0 p0Var2 = this.f57864c;
                q0 q0Var = t0Var2.f58077e;
                long j3 = p0Var2.f58009a;
                gy0 gy0Var = (gy0) q0Var;
                synchronized (gy0Var) {
                    gy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.f57863b;
                p0 p0Var3 = this.f57864c;
                ((gy0) t0Var3.f58077e).c(p0Var3.f58009a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57862a = 1;
        this.f57863b = t0Var;
        this.f57864c = p0Var;
    }
}
