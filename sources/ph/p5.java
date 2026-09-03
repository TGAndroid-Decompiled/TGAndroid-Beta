package ph;

import android.os.SystemClock;
public final class p5 implements Runnable {
    public final int f42209a;
    public final s5 f42210b;

    public p5(s5 s5Var, int i10) {
        this.f42209a = i10;
        this.f42210b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f42209a) {
            case 0:
                s5 s5Var = this.f42210b;
                s5Var.f42356o0 = false;
                s5Var.f42367w0 = false;
                s5Var.f42362s0 = SystemClock.elapsedRealtime();
                s5Var.f42360r0 = true;
                s5Var.f42363t0 = false;
                s5Var.G.c(false);
                s5Var.H.c(false);
                s5Var.I.c(false);
                ((a9) s5Var.f42338a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                s5 s5Var2 = this.f42210b;
                s5Var2.N = currentTimeMillis;
                s5Var2.O = 0L;
                s5Var2.f42356o0 = true;
                ((a9) s5Var2.f42338a).f41310a.G0.a(0L, true);
                return;
            case 2:
                s5 s5Var3 = this.f42210b;
                if (!s5Var3.f42356o0 && !s5Var3.b()) {
                    if (!da.d(((a9) s5Var3.f42338a).f41310a)) {
                        s5Var3.f42363t0 = false;
                        s5Var3.G.c(false);
                        s5Var3.H.c(false);
                        s5Var3.I.c(false);
                        return;
                    }
                    s5Var3.f42367w0 = true;
                    s5Var3.f42369x0 = true;
                    ((a9) s5Var3.f42338a).e(new p5(s5Var3, 4), true);
                    return;
                }
                return;
            case 3:
                s5 s5Var4 = this.f42210b;
                if (!s5Var4.f42356o0 && !s5Var4.b()) {
                    i9 i9Var = ((a9) s5Var4.f42338a).f41310a.f41589y0;
                    if (i9Var != null) {
                        i9Var.toggleDual();
                    }
                    s5Var4.d(360.0f);
                    s5Var4.f42363t0 = false;
                    s5Var4.G.c(false);
                    s5Var4.H.c(false);
                    s5Var4.I.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                s5 s5Var5 = this.f42210b;
                s5Var5.N = currentTimeMillis2;
                s5Var5.f42356o0 = true;
                q5 q5Var = s5Var5.f42338a;
                s5Var5.O = 0L;
                ((a9) q5Var).f41310a.G0.a(0L, true);
                return;
        }
    }
}
