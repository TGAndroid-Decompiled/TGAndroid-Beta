package wi;

import org.telegram.ui.Components.gy0;
public final class h0 implements Runnable {
    public final int f57887a;
    public final t0 f57888b;
    public final p0 f57889c;

    public h0(t0 t0Var, p0 p0Var, int i7, int i10) {
        this.f57887a = i10;
        this.f57888b = t0Var;
        this.f57889c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57887a) {
            case 0:
                t0 t0Var = this.f57888b;
                p0 p0Var = this.f57889c;
                ((gy0) t0Var.f58102e).c(p0Var.f58034a);
                return;
            case 1:
                t0 t0Var2 = this.f57888b;
                p0 p0Var2 = this.f57889c;
                q0 q0Var = t0Var2.f58102e;
                long j3 = p0Var2.f58034a;
                gy0 gy0Var = (gy0) q0Var;
                synchronized (gy0Var) {
                    gy0Var.c(j3);
                }
                return;
            default:
                t0 t0Var3 = this.f57888b;
                p0 p0Var3 = this.f57889c;
                ((gy0) t0Var3.f58102e).c(p0Var3.f58034a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f57887a = 1;
        this.f57888b = t0Var;
        this.f57889c = p0Var;
    }
}
