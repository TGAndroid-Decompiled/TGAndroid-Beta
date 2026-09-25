package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wh1 implements Runnable {
    public final int f39370a;
    public final mi1 f39371b;

    public wh1(mi1 mi1Var, int i10) {
        this.f39370a = i10;
        this.f39371b = mi1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39370a) {
            case 0:
                this.f39371b.f35606u0.b();
                return;
            case 1:
                this.f39371b.f35606u0.b();
                return;
            case 2:
                this.f39371b.f35606u0.b();
                return;
            case 3:
                this.f39371b.f35606u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f39371b.Z;
                v1Var.f29695c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                mi1 mi1Var = this.f39371b;
                mi1Var.f35600q0 = mi1Var.f35599p0;
                mi1Var.H();
                return;
            case 6:
                this.f39371b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                mi1 mi1Var2 = this.f39371b;
                mi1Var2.f35579e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                mi1Var2.e.getLocationOnScreen(iArr);
                mi1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.h.getLocationOnScreen(iArr);
                mi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35581f.getLocationOnScreen(iArr);
                mi1Var2.f35581f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                mi1Var2.f35581f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35596n.getLocationOnScreen(iArr);
                mi1Var2.f35596n.setTranslationX((((mi1Var2.f35579e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                mi1Var2.f35596n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                mi1Var2.f35596n.setAlpha(1.0f);
                mi1Var2.e.setAlpha(1.0f);
                mi1Var2.h.setAlpha(1.0f);
                mi1Var2.f35581f.setAlpha(1.0f);
                long j3 = 200;
                mi1Var2.f35596n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                mi1Var2.f35581f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f39371b.f35606u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    mi1 mi1Var3 = this.f39371b;
                    mi1Var3.O0.setTranslationY(mi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    mi1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f39371b.f35606u0.b();
                return;
            case 11:
                mi1 mi1Var4 = this.f39371b;
                mi1Var4.f35606u0.setAlpha(1.0f);
                mi1Var4.f35606u0.invalidate();
                ValueAnimator k10 = mi1Var4.k(true);
                mi1Var4.H.setAlpha(0.0f);
                mi1Var4.I.setAlpha(0.0f);
                mi1Var4.N.setAlpha(0.0f);
                mi1Var4.X.setAlpha(0.0f);
                mi1Var4.f35590j0.setAlpha(0.0f);
                mi1Var4.f35586h0.setAlpha(0.0f);
                mi1Var4.f35588i0.setAlpha(0.0f);
                mi1Var4.K.setAlpha(0.0f);
                mi1Var4.M0.setAlpha(0.0f);
                mi1Var4.Y.f29693b0 = true;
                AndroidUtilities.runOnUIThread(new p81(21, mi1Var4, k10), 32L);
                return;
            case 12:
                mi1 mi1Var5 = this.f39371b;
                mi1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = mi1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mi1Var5.f35614z0 && mi1Var5.f35611x0 && !mi1Var5.C0 && !z10) {
                    mi1Var5.K0 = System.currentTimeMillis();
                    mi1Var5.A(false);
                    mi1Var5.f35600q0 = mi1Var5.f35599p0;
                    mi1Var5.H();
                    return;
                }
                return;
            default:
                mi1 mi1Var6 = this.f39371b;
                if (mi1Var6.f35599p0 == 3) {
                    mi1Var6.f35612y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = mi1Var6.v;
                    if (!d3Var.R) {
                        d3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
