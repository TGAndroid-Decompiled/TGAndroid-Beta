package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;
public final class g5 implements Runnable {
    public final int f45359a;
    public final i5 f45360b;

    public g5(i5 i5Var, int i10) {
        this.f45359a = i10;
        this.f45360b = i5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f45359a) {
            case 0:
                this.f45360b.r();
                return;
            case 1:
                this.f45360b.r();
                return;
            case 2:
                this.f45360b.m(0L);
                return;
            case 3:
                i5 i5Var = this.f45360b;
                g5 g5Var = i5Var.H;
                j71 j71Var = i5Var.f45439e;
                if (j71Var != null && i5Var.C != null) {
                    long n10 = j71Var.n();
                    if (i5Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) i5Var.getDuration());
                        boolean z10 = false;
                        if (!i5Var.C.f45685j1) {
                            r6 r6Var = i5Var.d;
                            if ((duration < r6Var.Z || duration > r6Var.f45993a0) && System.currentTimeMillis() - i5Var.G > 500) {
                                i5Var.G = System.currentTimeMillis();
                                j71 j71Var2 = i5Var.f45439e;
                                long duration2 = i5Var.d.Z * ((float) i5Var.getDuration());
                                j71Var2.L(duration2, false);
                                i5Var.w(true);
                                i5Var.y(true);
                                n10 = duration2;
                                i5Var.C.setProgress(i5Var.f45439e.n());
                            }
                        }
                        if (n10 < i5Var.F) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i5Var.w(z4);
                        if (n10 < i5Var.F) {
                            z10 = true;
                        }
                        i5Var.y(z10);
                        i5Var.C.setProgress(i5Var.f45439e.n());
                    } else {
                        i5Var.C.setProgress(i5Var.f45439e.n());
                    }
                    if (i5Var.f45439e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var);
                        AndroidUtilities.runOnUIThread(g5Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    i5Var.F = n10;
                    return;
                }
                return;
            case 4:
                i5 i5Var2 = this.f45360b;
                g5 g5Var2 = i5Var2.I;
                if (i5Var2.f45465y != null && i5Var2.f45439e == null && i5Var2.f45463x == null && i5Var2.C != null && !i5Var2.j()) {
                    long n11 = i5Var2.f45465y.n();
                    r6 r6Var2 = i5Var2.d;
                    if (r6Var2 != null) {
                        float f10 = (float) n11;
                        float f11 = r6Var2.E;
                        float f12 = (float) r6Var2.C;
                        if ((f10 < f11 * f12 || f10 > r6Var2.F * f12) && System.currentTimeMillis() - i5Var2.G > 500) {
                            i5Var2.G = System.currentTimeMillis();
                            j71 j71Var3 = i5Var2.f45465y;
                            r6 r6Var3 = i5Var2.d;
                            long j10 = r6Var3.E * ((float) r6Var3.C);
                            j71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    i5Var2.C.setProgress(n11);
                    if (i5Var2.f45465y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var2);
                        AndroidUtilities.runOnUIThread(g5Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                i5 i5Var3 = this.f45360b;
                g5 g5Var3 = i5Var3.J;
                if (i5Var3.f45463x != null && i5Var3.f45439e == null && !i5Var3.j() && i5Var3.C != null) {
                    long n12 = i5Var3.f45463x.n();
                    r6 r6Var4 = i5Var3.d;
                    if (r6Var4 != null) {
                        float f13 = (float) n12;
                        float f14 = r6Var4.f46031s0;
                        float f15 = (float) r6Var4.f46027q0;
                        if ((f13 < f14 * f15 || f13 > r6Var4.f46033t0 * f15) && System.currentTimeMillis() - i5Var3.G > 500) {
                            i5Var3.G = System.currentTimeMillis();
                            j71 j71Var4 = i5Var3.f45463x;
                            r6 r6Var5 = i5Var3.d;
                            long j11 = r6Var5.f46031s0 * ((float) r6Var5.f46027q0);
                            j71Var4.L(j11, false);
                            i5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    i5Var3.C.setProgress(n12);
                    if (i5Var3.f45463x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g5Var3);
                        AndroidUtilities.runOnUIThread(g5Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                i5 i5Var4 = this.f45360b;
                x61 x61Var = i5Var4.f45449n;
                if (x61Var != null) {
                    xz xzVar = x61Var.f32958b;
                    if (xzVar != null) {
                        xzVar.postRunnable(new uz(xzVar, 0));
                    }
                    x61Var.f32957a = null;
                    i5Var4.removeView(i5Var4.f45449n);
                    i5Var4.f45449n = null;
                    return;
                }
                return;
        }
    }
}
