package vh;

import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.v61;
public final class i4 implements Runnable {
    public final int f51292a;
    public final k4 f51293b;

    public i4(k4 k4Var, int i10) {
        this.f51292a = i10;
        this.f51293b = k4Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f51292a) {
            case 0:
                this.f51293b.r();
                return;
            case 1:
                this.f51293b.r();
                return;
            case 2:
                this.f51293b.m(0L);
                return;
            case 3:
                k4 k4Var = this.f51293b;
                i4 i4Var = k4Var.K;
                v61 v61Var = k4Var.e;
                if (v61Var != null && k4Var.F != null) {
                    long S = v61Var.S();
                    if (k4Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) k4Var.getDuration());
                        boolean z11 = false;
                        if (!k4Var.F.f52302m1) {
                            n5 n5Var = k4Var.d;
                            if ((duration < n5Var.Z || duration > n5Var.f51530a0) && System.currentTimeMillis() - k4Var.J > 500) {
                                k4Var.J = System.currentTimeMillis();
                                v61 v61Var2 = k4Var.e;
                                long duration2 = k4Var.d.Z * ((float) k4Var.getDuration());
                                v61Var2.q0(duration2, false);
                                k4Var.w(true);
                                k4Var.y(true);
                                S = duration2;
                                k4Var.F.setProgress(k4Var.e.S());
                            }
                        }
                        if (S < k4Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k4Var.w(z10);
                        if (S < k4Var.I) {
                            z11 = true;
                        }
                        k4Var.y(z11);
                        k4Var.F.setProgress(k4Var.e.S());
                    } else {
                        k4Var.F.setProgress(k4Var.e.S());
                    }
                    if (k4Var.e.d0()) {
                        org.telegram.messenger.i0.r(i4Var);
                        org.telegram.messenger.i0.h3(i4Var, 1000.0f / org.telegram.messenger.i0.f16173r);
                    }
                    k4Var.I = S;
                    return;
                }
                return;
            case 4:
                k4 k4Var2 = this.f51293b;
                i4 i4Var2 = k4Var2.L;
                if (k4Var2.D != null && k4Var2.e == null && k4Var2.f51448y == null && k4Var2.F != null && !k4Var2.j()) {
                    long S2 = k4Var2.D.S();
                    n5 n5Var2 = k4Var2.d;
                    if (n5Var2 != null) {
                        float f7 = (float) S2;
                        float f10 = n5Var2.E;
                        float f11 = (float) n5Var2.C;
                        if ((f7 < f10 * f11 || f7 > n5Var2.F * f11) && System.currentTimeMillis() - k4Var2.J > 500) {
                            k4Var2.J = System.currentTimeMillis();
                            v61 v61Var3 = k4Var2.D;
                            n5 n5Var3 = k4Var2.d;
                            long j10 = n5Var3.E * ((float) n5Var3.C);
                            v61Var3.q0(j10, false);
                            S2 = j10;
                        }
                    }
                    k4Var2.F.setProgress(S2);
                    if (k4Var2.D.d0()) {
                        org.telegram.messenger.i0.r(i4Var2);
                        org.telegram.messenger.i0.h3(i4Var2, 1000.0f / org.telegram.messenger.i0.f16173r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                k4 k4Var3 = this.f51293b;
                i4 i4Var3 = k4Var3.M;
                if (k4Var3.f51448y != null && k4Var3.e == null && !k4Var3.j() && k4Var3.F != null) {
                    long S3 = k4Var3.f51448y.S();
                    n5 n5Var4 = k4Var3.d;
                    if (n5Var4 != null) {
                        float f12 = (float) S3;
                        float f13 = n5Var4.f51567s0;
                        float f14 = (float) n5Var4.f51563q0;
                        if ((f12 < f13 * f14 || f12 > n5Var4.f51569t0 * f14) && System.currentTimeMillis() - k4Var3.J > 500) {
                            k4Var3.J = System.currentTimeMillis();
                            v61 v61Var4 = k4Var3.f51448y;
                            n5 n5Var5 = k4Var3.d;
                            long j11 = n5Var5.f51567s0 * ((float) n5Var5.f51563q0);
                            v61Var4.q0(j11, false);
                            k4Var3.w(true);
                            S3 = j11;
                        }
                    }
                    k4Var3.F.setProgress(S3);
                    if (k4Var3.f51448y.d0()) {
                        org.telegram.messenger.i0.r(i4Var3);
                        org.telegram.messenger.i0.h3(i4Var3, 1000.0f / org.telegram.messenger.i0.f16173r);
                        return;
                    }
                    return;
                }
                return;
            default:
                k4 k4Var4 = this.f51293b;
                l61 l61Var = k4Var4.f51432n;
                if (l61Var != null) {
                    gz gzVar = l61Var.f28063b;
                    if (gzVar != null) {
                        gzVar.postRunnable(new dz(gzVar, 0));
                    }
                    l61Var.f28062a = null;
                    k4Var4.removeView(k4Var4.f51432n);
                    k4Var4.f51432n = null;
                    return;
                }
                return;
        }
    }
}
