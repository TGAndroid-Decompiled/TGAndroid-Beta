package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wh1 implements Runnable {
    public final int f38992a;
    public final mi1 f38993b;

    public wh1(mi1 mi1Var, int i10) {
        this.f38992a = i10;
        this.f38993b = mi1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38992a) {
            case 0:
                this.f38993b.f35339u0.b();
                return;
            case 1:
                this.f38993b.f35339u0.b();
                return;
            case 2:
                this.f38993b.f35339u0.b();
                return;
            case 3:
                this.f38993b.f35339u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.u1 u1Var = this.f38993b.Z;
                u1Var.f29254c0 = false;
                u1Var.invalidate();
                return;
            case 5:
                mi1 mi1Var = this.f38993b;
                mi1Var.f35333q0 = mi1Var.f35332p0;
                mi1Var.H();
                return;
            case 6:
                this.f38993b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                mi1 mi1Var2 = this.f38993b;
                mi1Var2.f35312e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                mi1Var2.e.getLocationOnScreen(iArr);
                mi1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.h.getLocationOnScreen(iArr);
                mi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35314f.getLocationOnScreen(iArr);
                mi1Var2.f35314f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.f35314f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35329n.getLocationOnScreen(iArr);
                mi1Var2.f35329n.setTranslationX((((mi1Var2.f35312e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                mi1Var2.f35329n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35329n.setAlpha(1.0f);
                mi1Var2.e.setAlpha(1.0f);
                mi1Var2.h.setAlpha(1.0f);
                mi1Var2.f35314f.setAlpha(1.0f);
                long j3 = 200;
                mi1Var2.f35329n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.f35314f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f38993b.f35339u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    mi1 mi1Var3 = this.f38993b;
                    mi1Var3.O0.setTranslationY(mi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    mi1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38993b.f35339u0.b();
                return;
            case 11:
                mi1 mi1Var4 = this.f38993b;
                mi1Var4.f35339u0.setAlpha(1.0f);
                mi1Var4.f35339u0.invalidate();
                ValueAnimator k10 = mi1Var4.k(true);
                mi1Var4.H.setAlpha(0.0f);
                mi1Var4.I.setAlpha(0.0f);
                mi1Var4.N.setAlpha(0.0f);
                mi1Var4.X.setAlpha(0.0f);
                mi1Var4.f35323j0.setAlpha(0.0f);
                mi1Var4.f35319h0.setAlpha(0.0f);
                mi1Var4.f35321i0.setAlpha(0.0f);
                mi1Var4.K.setAlpha(0.0f);
                mi1Var4.M0.setAlpha(0.0f);
                mi1Var4.Y.f29252b0 = true;
                AndroidUtilities.runOnUIThread(new hb1(16, mi1Var4, k10), 32L);
                return;
            case 12:
                mi1 mi1Var5 = this.f38993b;
                mi1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = mi1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mi1Var5.f35347z0 && mi1Var5.f35344x0 && !mi1Var5.C0 && !z10) {
                    mi1Var5.K0 = System.currentTimeMillis();
                    mi1Var5.A(false);
                    mi1Var5.f35333q0 = mi1Var5.f35332p0;
                    mi1Var5.H();
                    return;
                }
                return;
            default:
                mi1 mi1Var6 = this.f38993b;
                if (mi1Var6.f35332p0 == 3) {
                    mi1Var6.f35345y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = mi1Var6.v;
                    if (!c3Var.R) {
                        c3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
