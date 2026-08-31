package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y61;
public final class h5 implements Runnable {
    public final int f45378a;
    public final j5 f45379b;

    public h5(j5 j5Var, int i10) {
        this.f45378a = i10;
        this.f45379b = j5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f45378a) {
            case 0:
                this.f45379b.r();
                return;
            case 1:
                this.f45379b.r();
                return;
            case 2:
                this.f45379b.m(0L);
                return;
            case 3:
                j5 j5Var = this.f45379b;
                h5 h5Var = j5Var.H;
                k71 k71Var = j5Var.f45469e;
                if (k71Var != null && j5Var.C != null) {
                    long n10 = k71Var.n();
                    if (j5Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) j5Var.getDuration());
                        boolean z10 = false;
                        if (!j5Var.C.f45711j1) {
                            s6 s6Var = j5Var.d;
                            if ((duration < s6Var.Z || duration > s6Var.f46042a0) && System.currentTimeMillis() - j5Var.G > 500) {
                                j5Var.G = System.currentTimeMillis();
                                k71 k71Var2 = j5Var.f45469e;
                                long duration2 = j5Var.d.Z * ((float) j5Var.getDuration());
                                k71Var2.L(duration2, false);
                                j5Var.w(true);
                                j5Var.y(true);
                                n10 = duration2;
                                j5Var.C.setProgress(j5Var.f45469e.n());
                            }
                        }
                        if (n10 < j5Var.F) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j5Var.w(z4);
                        if (n10 < j5Var.F) {
                            z10 = true;
                        }
                        j5Var.y(z10);
                        j5Var.C.setProgress(j5Var.f45469e.n());
                    } else {
                        j5Var.C.setProgress(j5Var.f45469e.n());
                    }
                    if (j5Var.f45469e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var);
                        AndroidUtilities.runOnUIThread(h5Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    j5Var.F = n10;
                    return;
                }
                return;
            case 4:
                j5 j5Var2 = this.f45379b;
                h5 h5Var2 = j5Var2.I;
                if (j5Var2.f45495y != null && j5Var2.f45469e == null && j5Var2.f45493x == null && j5Var2.C != null && !j5Var2.j()) {
                    long n11 = j5Var2.f45495y.n();
                    s6 s6Var2 = j5Var2.d;
                    if (s6Var2 != null) {
                        float f10 = (float) n11;
                        float f11 = s6Var2.E;
                        float f12 = (float) s6Var2.C;
                        if ((f10 < f11 * f12 || f10 > s6Var2.F * f12) && System.currentTimeMillis() - j5Var2.G > 500) {
                            j5Var2.G = System.currentTimeMillis();
                            k71 k71Var3 = j5Var2.f45495y;
                            s6 s6Var3 = j5Var2.d;
                            long j10 = s6Var3.E * ((float) s6Var3.C);
                            k71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    j5Var2.C.setProgress(n11);
                    if (j5Var2.f45495y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var2);
                        AndroidUtilities.runOnUIThread(h5Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                j5 j5Var3 = this.f45379b;
                h5 h5Var3 = j5Var3.J;
                if (j5Var3.f45493x != null && j5Var3.f45469e == null && !j5Var3.j() && j5Var3.C != null) {
                    long n12 = j5Var3.f45493x.n();
                    s6 s6Var4 = j5Var3.d;
                    if (s6Var4 != null) {
                        float f13 = (float) n12;
                        float f14 = s6Var4.f46080s0;
                        float f15 = (float) s6Var4.f46076q0;
                        if ((f13 < f14 * f15 || f13 > s6Var4.f46082t0 * f15) && System.currentTimeMillis() - j5Var3.G > 500) {
                            j5Var3.G = System.currentTimeMillis();
                            k71 k71Var4 = j5Var3.f45493x;
                            s6 s6Var5 = j5Var3.d;
                            long j11 = s6Var5.f46080s0 * ((float) s6Var5.f46076q0);
                            k71Var4.L(j11, false);
                            j5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    j5Var3.C.setProgress(n12);
                    if (j5Var3.f45493x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(h5Var3);
                        AndroidUtilities.runOnUIThread(h5Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                j5 j5Var4 = this.f45379b;
                y61 y61Var = j5Var4.f45479n;
                if (y61Var != null) {
                    xz xzVar = y61Var.f33384b;
                    if (xzVar != null) {
                        xzVar.postRunnable(new uz(xzVar, 0));
                    }
                    y61Var.f33383a = null;
                    j5Var4.removeView(j5Var4.f45479n);
                    j5Var4.f45479n = null;
                    return;
                }
                return;
        }
    }
}
