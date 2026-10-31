package vh;

import android.os.SystemClock;
public final class p4 implements Runnable {
    public final int f51762a;
    public final r4 f51763b;

    public p4(r4 r4Var, int i10) {
        this.f51762a = i10;
        this.f51763b = r4Var;
    }

    @Override
    public final void run() {
        switch (this.f51762a) {
            case 0:
                r4 r4Var = this.f51763b;
                r4Var.f51872r0 = false;
                r4Var.f51884z0 = false;
                r4Var.f51877v0 = SystemClock.elapsedRealtime();
                r4Var.f51876u0 = true;
                r4Var.f51879w0 = false;
                r4Var.J.c(false);
                r4Var.K.c(false);
                r4Var.L.c(false);
                ((o7) r4Var.f51850a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                r4 r4Var2 = this.f51763b;
                r4Var2.Q = currentTimeMillis;
                r4Var2.R = 0L;
                r4Var2.f51872r0 = true;
                ((o7) r4Var2.f51850a).f51603a.J0.a(0L, true);
                return;
            case 2:
                r4 r4Var3 = this.f51763b;
                if (!r4Var3.f51872r0 && !r4Var3.b()) {
                    if (!o8.c(((o7) r4Var3.f51850a).f51603a)) {
                        r4Var3.f51879w0 = false;
                        r4Var3.J.c(false);
                        r4Var3.K.c(false);
                        r4Var3.L.c(false);
                        return;
                    }
                    r4Var3.f51884z0 = true;
                    r4Var3.A0 = true;
                    ((o7) r4Var3.f51850a).f(new p4(r4Var3, 4), true);
                    return;
                }
                return;
            case 3:
                r4 r4Var4 = this.f51763b;
                if (!r4Var4.f51872r0 && !r4Var4.b()) {
                    t7 t7Var = ((o7) r4Var4.f51850a).f51603a.B0;
                    if (t7Var != null) {
                        t7Var.toggleDual();
                    }
                    r4Var4.d(360.0f);
                    r4Var4.f51879w0 = false;
                    r4Var4.J.c(false);
                    r4Var4.K.c(false);
                    r4Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                r4 r4Var5 = this.f51763b;
                r4Var5.Q = currentTimeMillis2;
                r4Var5.f51872r0 = true;
                q4 q4Var = r4Var5.f51850a;
                r4Var5.R = 0L;
                ((o7) q4Var).f51603a.J0.a(0L, true);
                return;
        }
    }
}
