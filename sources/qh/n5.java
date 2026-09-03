package qh;

import android.os.SystemClock;
public final class n5 implements Runnable {
    public final int f45802a;
    public final q5 f45803b;

    public n5(q5 q5Var, int i10) {
        this.f45802a = i10;
        this.f45803b = q5Var;
    }

    @Override
    public final void run() {
        switch (this.f45802a) {
            case 0:
                q5 q5Var = this.f45803b;
                q5Var.f45944o0 = false;
                q5Var.f45955w0 = false;
                q5Var.f45950s0 = SystemClock.elapsedRealtime();
                q5Var.f45948r0 = true;
                q5Var.f45951t0 = false;
                q5Var.G.c(false);
                q5Var.H.c(false);
                q5Var.I.c(false);
                ((x8) q5Var.f45925a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                q5 q5Var2 = this.f45803b;
                q5Var2.N = currentTimeMillis;
                q5Var2.O = 0L;
                q5Var2.f45944o0 = true;
                ((x8) q5Var2.f45925a).f46318a.G0.a(0L, true);
                return;
            case 2:
                q5 q5Var3 = this.f45803b;
                if (!q5Var3.f45944o0 && !q5Var3.b()) {
                    if (!ba.d(((x8) q5Var3.f45925a).f46318a)) {
                        q5Var3.f45951t0 = false;
                        q5Var3.G.c(false);
                        q5Var3.H.c(false);
                        q5Var3.I.c(false);
                        return;
                    }
                    q5Var3.f45955w0 = true;
                    q5Var3.f45957x0 = true;
                    ((x8) q5Var3.f45925a).e(new n5(q5Var3, 4), true);
                    return;
                }
                return;
            case 3:
                q5 q5Var4 = this.f45803b;
                if (!q5Var4.f45944o0 && !q5Var4.b()) {
                    f9 f9Var = ((x8) q5Var4.f45925a).f46318a.f45120y0;
                    if (f9Var != null) {
                        f9Var.toggleDual();
                    }
                    q5Var4.d(360.0f);
                    q5Var4.f45951t0 = false;
                    q5Var4.G.c(false);
                    q5Var4.H.c(false);
                    q5Var4.I.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                q5 q5Var5 = this.f45803b;
                q5Var5.N = currentTimeMillis2;
                q5Var5.f45944o0 = true;
                o5 o5Var = q5Var5.f45925a;
                q5Var5.O = 0L;
                ((x8) o5Var).f46318a.G0.a(0L, true);
                return;
        }
    }
}
