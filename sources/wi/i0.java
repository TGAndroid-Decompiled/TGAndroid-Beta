package wi;

import org.telegram.ui.Components.hy0;
public final class i0 implements Runnable {
    public final int f57895a;
    public final u0 f57896b;
    public final q0 f57897c;

    public i0(u0 u0Var, q0 q0Var, int i7, int i10) {
        this.f57895a = i10;
        this.f57896b = u0Var;
        this.f57897c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f57895a) {
            case 0:
                u0 u0Var = this.f57896b;
                q0 q0Var = this.f57897c;
                ((hy0) u0Var.f58107e).c(q0Var.f58034a);
                return;
            case 1:
                u0 u0Var2 = this.f57896b;
                q0 q0Var2 = this.f57897c;
                r0 r0Var = u0Var2.f58107e;
                long j3 = q0Var2.f58034a;
                hy0 hy0Var = (hy0) r0Var;
                synchronized (hy0Var) {
                    hy0Var.c(j3);
                }
                return;
            default:
                u0 u0Var3 = this.f57896b;
                q0 q0Var3 = this.f57897c;
                ((hy0) u0Var3.f58107e).c(q0Var3.f58034a);
                return;
        }
    }

    public i0(u0 u0Var, q0 q0Var, Exception exc) {
        this.f57895a = 1;
        this.f57896b = u0Var;
        this.f57897c = q0Var;
    }
}
