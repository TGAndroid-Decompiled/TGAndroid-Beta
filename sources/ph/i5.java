package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
public final class i5 implements Runnable {
    public final int f41752a;
    public final l5 f41753b;

    public i5(l5 l5Var, int i10) {
        this.f41752a = i10;
        this.f41753b = l5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f41752a) {
            case 0:
                this.f41753b.r();
                return;
            case 1:
                this.f41753b.r();
                return;
            case 2:
                this.f41753b.m(0L);
                return;
            case 3:
                l5 l5Var = this.f41753b;
                i5 i5Var = l5Var.H;
                i71 i71Var = l5Var.e;
                if (i71Var != null && l5Var.C != null) {
                    long n10 = i71Var.n();
                    if (l5Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) l5Var.getDuration());
                        boolean z10 = false;
                        if (!l5Var.C.f42094j1) {
                            u6 u6Var = l5Var.d;
                            if ((duration < u6Var.Z || duration > u6Var.f42399a0) && System.currentTimeMillis() - l5Var.G > 500) {
                                l5Var.G = System.currentTimeMillis();
                                i71 i71Var2 = l5Var.e;
                                long duration2 = l5Var.d.Z * ((float) l5Var.getDuration());
                                i71Var2.L(duration2, false);
                                l5Var.w(true);
                                l5Var.y(true);
                                n10 = duration2;
                                l5Var.C.setProgress(l5Var.e.n());
                            }
                        }
                        if (n10 < l5Var.F) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        l5Var.w(z4);
                        if (n10 < l5Var.F) {
                            z10 = true;
                        }
                        l5Var.y(z10);
                        l5Var.C.setProgress(l5Var.e.n());
                    } else {
                        l5Var.C.setProgress(l5Var.e.n());
                    }
                    if (l5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        AndroidUtilities.runOnUIThread(i5Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    l5Var.F = n10;
                    return;
                }
                return;
            case 4:
                l5 l5Var2 = this.f41753b;
                i5 i5Var2 = l5Var2.I;
                if (l5Var2.f41910y != null && l5Var2.e == null && l5Var2.f41908x == null && l5Var2.C != null && !l5Var2.j()) {
                    long n11 = l5Var2.f41910y.n();
                    u6 u6Var2 = l5Var2.d;
                    if (u6Var2 != null) {
                        float f10 = (float) n11;
                        float f11 = u6Var2.E;
                        float f12 = (float) u6Var2.C;
                        if ((f10 < f11 * f12 || f10 > u6Var2.F * f12) && System.currentTimeMillis() - l5Var2.G > 500) {
                            l5Var2.G = System.currentTimeMillis();
                            i71 i71Var3 = l5Var2.f41910y;
                            u6 u6Var3 = l5Var2.d;
                            long j10 = u6Var3.E * ((float) u6Var3.C);
                            i71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    l5Var2.C.setProgress(n11);
                    if (l5Var2.f41910y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var2);
                        AndroidUtilities.runOnUIThread(i5Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                l5 l5Var3 = this.f41753b;
                i5 i5Var3 = l5Var3.J;
                if (l5Var3.f41908x != null && l5Var3.e == null && !l5Var3.j() && l5Var3.C != null) {
                    long n12 = l5Var3.f41908x.n();
                    u6 u6Var4 = l5Var3.d;
                    if (u6Var4 != null) {
                        float f13 = (float) n12;
                        float f14 = u6Var4.f42436s0;
                        float f15 = (float) u6Var4.f42432q0;
                        if ((f13 < f14 * f15 || f13 > u6Var4.f42438t0 * f15) && System.currentTimeMillis() - l5Var3.G > 500) {
                            l5Var3.G = System.currentTimeMillis();
                            i71 i71Var4 = l5Var3.f41908x;
                            u6 u6Var5 = l5Var3.d;
                            long j11 = u6Var5.f42436s0 * ((float) u6Var5.f42432q0);
                            i71Var4.L(j11, false);
                            l5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    l5Var3.C.setProgress(n12);
                    if (l5Var3.f41908x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var3);
                        AndroidUtilities.runOnUIThread(i5Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                l5 l5Var4 = this.f41753b;
                w61 w61Var = l5Var4.f41894n;
                if (w61Var != null) {
                    vz vzVar = w61Var.f30249b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    w61Var.f30248a = null;
                    l5Var4.removeView(l5Var4.f41894n);
                    l5Var4.f41894n = null;
                    return;
                }
                return;
        }
    }
}
