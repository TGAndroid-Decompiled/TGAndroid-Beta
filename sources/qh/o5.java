package qh;

import android.os.SystemClock;
public final class o5 implements Runnable {
    public final int f45830a;
    public final r5 f45831b;

    public o5(r5 r5Var, int i10) {
        this.f45830a = i10;
        this.f45831b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f45830a) {
            case 0:
                r5 r5Var = this.f45831b;
                r5Var.f45965o0 = false;
                r5Var.f45976w0 = false;
                r5Var.f45971s0 = SystemClock.elapsedRealtime();
                r5Var.f45969r0 = true;
                r5Var.f45972t0 = false;
                r5Var.G.c(false);
                r5Var.H.c(false);
                r5Var.I.c(false);
                ((y8) r5Var.f45946a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                r5 r5Var2 = this.f45831b;
                r5Var2.N = currentTimeMillis;
                r5Var2.O = 0L;
                r5Var2.f45965o0 = true;
                ((y8) r5Var2.f45946a).f46362a.G0.a(0L, true);
                return;
            case 2:
                r5 r5Var3 = this.f45831b;
                if (!r5Var3.f45965o0 && !r5Var3.b()) {
                    if (!ca.d(((y8) r5Var3.f45946a).f46362a)) {
                        r5Var3.f45972t0 = false;
                        r5Var3.G.c(false);
                        r5Var3.H.c(false);
                        r5Var3.I.c(false);
                        return;
                    }
                    r5Var3.f45976w0 = true;
                    r5Var3.f45978x0 = true;
                    ((y8) r5Var3.f45946a).e(new o5(r5Var3, 4), true);
                    return;
                }
                return;
            case 3:
                r5 r5Var4 = this.f45831b;
                if (!r5Var4.f45965o0 && !r5Var4.b()) {
                    g9 g9Var = ((y8) r5Var4.f45946a).f46362a.f45154y0;
                    if (g9Var != null) {
                        g9Var.toggleDual();
                    }
                    r5Var4.d(360.0f);
                    r5Var4.f45972t0 = false;
                    r5Var4.G.c(false);
                    r5Var4.H.c(false);
                    r5Var4.I.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                r5 r5Var5 = this.f45831b;
                r5Var5.N = currentTimeMillis2;
                r5Var5.f45965o0 = true;
                p5 p5Var = r5Var5.f45946a;
                r5Var5.O = 0L;
                ((y8) p5Var).f46362a.G0.a(0L, true);
                return;
        }
    }
}
