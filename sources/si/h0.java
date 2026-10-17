package si;

import org.telegram.ui.Components.y01;
public final class h0 implements Runnable {
    public final int f46628a;
    public final t0 f46629b;
    public final p0 f46630c;

    public h0(t0 t0Var, p0 p0Var, int i10, int i11) {
        this.f46628a = i11;
        this.f46629b = t0Var;
        this.f46630c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f46628a) {
            case 0:
                t0 t0Var = this.f46629b;
                p0 p0Var = this.f46630c;
                ((y01) t0Var.e).c(p0Var.f46768a);
                return;
            case 1:
                t0 t0Var2 = this.f46629b;
                p0 p0Var2 = this.f46630c;
                q0 q0Var = t0Var2.e;
                long j10 = p0Var2.f46768a;
                y01 y01Var = (y01) q0Var;
                synchronized (y01Var) {
                    y01Var.c(j10);
                }
                return;
            default:
                t0 t0Var3 = this.f46629b;
                p0 p0Var3 = this.f46630c;
                ((y01) t0Var3.e).c(p0Var3.f46768a);
                return;
        }
    }

    public h0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f46628a = 1;
        this.f46629b = t0Var;
        this.f46630c = p0Var;
    }
}
