package ph;

import android.os.SystemClock;
public final class q5 implements Runnable {
    public final int f42214a;
    public final t5 f42215b;

    public q5(t5 t5Var, int i10) {
        this.f42214a = i10;
        this.f42215b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f42214a) {
            case 0:
                t5 t5Var = this.f42215b;
                t5Var.f42350o0 = false;
                t5Var.f42361w0 = false;
                t5Var.f42356s0 = SystemClock.elapsedRealtime();
                t5Var.f42354r0 = true;
                t5Var.f42357t0 = false;
                t5Var.G.c(false);
                t5Var.H.c(false);
                t5Var.I.c(false);
                ((a9) t5Var.f42332a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                t5 t5Var2 = this.f42215b;
                t5Var2.N = currentTimeMillis;
                t5Var2.O = 0L;
                t5Var2.f42350o0 = true;
                ((a9) t5Var2.f42332a).f41281a.G0.a(0L, true);
                return;
            case 2:
                t5 t5Var3 = this.f42215b;
                if (!t5Var3.f42350o0 && !t5Var3.b()) {
                    if (!da.d(((a9) t5Var3.f42332a).f41281a)) {
                        t5Var3.f42357t0 = false;
                        t5Var3.G.c(false);
                        t5Var3.H.c(false);
                        t5Var3.I.c(false);
                        return;
                    }
                    t5Var3.f42361w0 = true;
                    t5Var3.f42363x0 = true;
                    ((a9) t5Var3.f42332a).e(new q5(t5Var3, 4), true);
                    return;
                }
                return;
            case 3:
                t5 t5Var4 = this.f42215b;
                if (!t5Var4.f42350o0 && !t5Var4.b()) {
                    i9 i9Var = ((a9) t5Var4.f42332a).f41281a.f41551y0;
                    if (i9Var != null) {
                        i9Var.toggleDual();
                    }
                    t5Var4.d(360.0f);
                    t5Var4.f42357t0 = false;
                    t5Var4.G.c(false);
                    t5Var4.H.c(false);
                    t5Var4.I.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                t5 t5Var5 = this.f42215b;
                t5Var5.N = currentTimeMillis2;
                t5Var5.f42350o0 = true;
                r5 r5Var = t5Var5.f42332a;
                t5Var5.O = 0L;
                ((a9) r5Var).f41281a.G0.a(0L, true);
                return;
        }
    }
}
