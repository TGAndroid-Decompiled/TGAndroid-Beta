package vh;

import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.u61;
public final class i4 implements Runnable {
    public final int f51277a;
    public final k4 f51278b;

    public i4(k4 k4Var, int i10) {
        this.f51277a = i10;
        this.f51278b = k4Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f51277a) {
            case 0:
                this.f51278b.r();
                return;
            case 1:
                this.f51278b.r();
                return;
            case 2:
                this.f51278b.m(0L);
                return;
            case 3:
                k4 k4Var = this.f51278b;
                i4 i4Var = k4Var.K;
                u61 u61Var = k4Var.e;
                if (u61Var != null && k4Var.F != null) {
                    long S = u61Var.S();
                    if (k4Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) k4Var.getDuration());
                        boolean z11 = false;
                        if (!k4Var.F.f52284m1) {
                            n5 n5Var = k4Var.d;
                            if ((duration < n5Var.Z || duration > n5Var.f51515a0) && System.currentTimeMillis() - k4Var.J > 500) {
                                k4Var.J = System.currentTimeMillis();
                                u61 u61Var2 = k4Var.e;
                                long duration2 = k4Var.d.Z * ((float) k4Var.getDuration());
                                u61Var2.q0(duration2, false);
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
                        org.telegram.messenger.i0.h3(i4Var, 1000.0f / org.telegram.messenger.i0.f16027r);
                    }
                    k4Var.I = S;
                    return;
                }
                return;
            case 4:
                k4 k4Var2 = this.f51278b;
                i4 i4Var2 = k4Var2.L;
                if (k4Var2.D != null && k4Var2.e == null && k4Var2.f51433y == null && k4Var2.F != null && !k4Var2.j()) {
                    long S2 = k4Var2.D.S();
                    n5 n5Var2 = k4Var2.d;
                    if (n5Var2 != null) {
                        float f7 = (float) S2;
                        float f10 = n5Var2.E;
                        float f11 = (float) n5Var2.C;
                        if ((f7 < f10 * f11 || f7 > n5Var2.F * f11) && System.currentTimeMillis() - k4Var2.J > 500) {
                            k4Var2.J = System.currentTimeMillis();
                            u61 u61Var3 = k4Var2.D;
                            n5 n5Var3 = k4Var2.d;
                            long j10 = n5Var3.E * ((float) n5Var3.C);
                            u61Var3.q0(j10, false);
                            S2 = j10;
                        }
                    }
                    k4Var2.F.setProgress(S2);
                    if (k4Var2.D.d0()) {
                        org.telegram.messenger.i0.r(i4Var2);
                        org.telegram.messenger.i0.h3(i4Var2, 1000.0f / org.telegram.messenger.i0.f16027r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                k4 k4Var3 = this.f51278b;
                i4 i4Var3 = k4Var3.M;
                if (k4Var3.f51433y != null && k4Var3.e == null && !k4Var3.j() && k4Var3.F != null) {
                    long S3 = k4Var3.f51433y.S();
                    n5 n5Var4 = k4Var3.d;
                    if (n5Var4 != null) {
                        float f12 = (float) S3;
                        float f13 = n5Var4.f51552s0;
                        float f14 = (float) n5Var4.f51548q0;
                        if ((f12 < f13 * f14 || f12 > n5Var4.f51554t0 * f14) && System.currentTimeMillis() - k4Var3.J > 500) {
                            k4Var3.J = System.currentTimeMillis();
                            u61 u61Var4 = k4Var3.f51433y;
                            n5 n5Var5 = k4Var3.d;
                            long j11 = n5Var5.f51552s0 * ((float) n5Var5.f51548q0);
                            u61Var4.q0(j11, false);
                            k4Var3.w(true);
                            S3 = j11;
                        }
                    }
                    k4Var3.F.setProgress(S3);
                    if (k4Var3.f51433y.d0()) {
                        org.telegram.messenger.i0.r(i4Var3);
                        org.telegram.messenger.i0.h3(i4Var3, 1000.0f / org.telegram.messenger.i0.f16027r);
                        return;
                    }
                    return;
                }
                return;
            default:
                k4 k4Var4 = this.f51278b;
                k61 k61Var = k4Var4.f51417n;
                if (k61Var != null) {
                    gz gzVar = k61Var.f27647b;
                    if (gzVar != null) {
                        gzVar.postRunnable(new dz(gzVar, 0));
                    }
                    k61Var.f27646a = null;
                    k4Var4.removeView(k4Var4.f51417n);
                    k4Var4.f51417n = null;
                    return;
                }
                return;
        }
    }
}
