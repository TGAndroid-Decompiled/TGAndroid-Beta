package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
public final class i5 implements Runnable {
    public final int f41783a;
    public final k5 f41784b;

    public i5(k5 k5Var, int i10) {
        this.f41783a = i10;
        this.f41784b = k5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f41783a) {
            case 0:
                this.f41784b.r();
                return;
            case 1:
                this.f41784b.r();
                return;
            case 2:
                this.f41784b.m(0L);
                return;
            case 3:
                k5 k5Var = this.f41784b;
                i5 i5Var = k5Var.H;
                i71 i71Var = k5Var.e;
                if (i71Var != null && k5Var.C != null) {
                    long n10 = i71Var.n();
                    if (k5Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) k5Var.getDuration());
                        boolean z10 = false;
                        if (!k5Var.C.f42142j1) {
                            t6 t6Var = k5Var.d;
                            if ((duration < t6Var.Z || duration > t6Var.f42400a0) && System.currentTimeMillis() - k5Var.G > 500) {
                                k5Var.G = System.currentTimeMillis();
                                i71 i71Var2 = k5Var.e;
                                long duration2 = k5Var.d.Z * ((float) k5Var.getDuration());
                                i71Var2.L(duration2, false);
                                k5Var.w(true);
                                k5Var.y(true);
                                n10 = duration2;
                                k5Var.C.setProgress(k5Var.e.n());
                            }
                        }
                        if (n10 < k5Var.F) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        k5Var.w(z4);
                        if (n10 < k5Var.F) {
                            z10 = true;
                        }
                        k5Var.y(z10);
                        k5Var.C.setProgress(k5Var.e.n());
                    } else {
                        k5Var.C.setProgress(k5Var.e.n());
                    }
                    if (k5Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var);
                        AndroidUtilities.runOnUIThread(i5Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    k5Var.F = n10;
                    return;
                }
                return;
            case 4:
                k5 k5Var2 = this.f41784b;
                i5 i5Var2 = k5Var2.I;
                if (k5Var2.f41920y != null && k5Var2.e == null && k5Var2.f41918x == null && k5Var2.C != null && !k5Var2.j()) {
                    long n11 = k5Var2.f41920y.n();
                    t6 t6Var2 = k5Var2.d;
                    if (t6Var2 != null) {
                        float f10 = (float) n11;
                        float f11 = t6Var2.E;
                        float f12 = (float) t6Var2.C;
                        if ((f10 < f11 * f12 || f10 > t6Var2.F * f12) && System.currentTimeMillis() - k5Var2.G > 500) {
                            k5Var2.G = System.currentTimeMillis();
                            i71 i71Var3 = k5Var2.f41920y;
                            t6 t6Var3 = k5Var2.d;
                            long j10 = t6Var3.E * ((float) t6Var3.C);
                            i71Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    k5Var2.C.setProgress(n11);
                    if (k5Var2.f41920y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var2);
                        AndroidUtilities.runOnUIThread(i5Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                k5 k5Var3 = this.f41784b;
                i5 i5Var3 = k5Var3.J;
                if (k5Var3.f41918x != null && k5Var3.e == null && !k5Var3.j() && k5Var3.C != null) {
                    long n12 = k5Var3.f41918x.n();
                    t6 t6Var4 = k5Var3.d;
                    if (t6Var4 != null) {
                        float f13 = (float) n12;
                        float f14 = t6Var4.f42437s0;
                        float f15 = (float) t6Var4.f42433q0;
                        if ((f13 < f14 * f15 || f13 > t6Var4.f42439t0 * f15) && System.currentTimeMillis() - k5Var3.G > 500) {
                            k5Var3.G = System.currentTimeMillis();
                            i71 i71Var4 = k5Var3.f41918x;
                            t6 t6Var5 = k5Var3.d;
                            long j11 = t6Var5.f42437s0 * ((float) t6Var5.f42433q0);
                            i71Var4.L(j11, false);
                            k5Var3.w(true);
                            n12 = j11;
                        }
                    }
                    k5Var3.C.setProgress(n12);
                    if (k5Var3.f41918x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i5Var3);
                        AndroidUtilities.runOnUIThread(i5Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                k5 k5Var4 = this.f41784b;
                w61 w61Var = k5Var4.f41904n;
                if (w61Var != null) {
                    vz vzVar = w61Var.f30156b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    w61Var.f30155a = null;
                    k5Var4.removeView(k5Var4.f41904n);
                    k5Var4.f41904n = null;
                    return;
                }
                return;
        }
    }
}
