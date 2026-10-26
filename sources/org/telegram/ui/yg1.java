package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yg1 implements Runnable {
    public final int f46067a;
    public final ph1 f46068b;

    public yg1(ph1 ph1Var, int i10) {
        this.f46067a = i10;
        this.f46068b = ph1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f46067a) {
            case 0:
                this.f46068b.f42548u0.b();
                return;
            case 1:
                this.f46068b.f42548u0.b();
                return;
            case 2:
                this.f46068b.f42548u0.b();
                return;
            case 3:
                this.f46068b.f42548u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f46068b.Z;
                v1Var.f34155c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                ph1 ph1Var = this.f46068b;
                ph1Var.f42542q0 = ph1Var.f42541p0;
                ph1Var.G();
                return;
            case 6:
                this.f46068b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                ph1 ph1Var2 = this.f46068b;
                ph1Var2.f42521e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ph1Var2.e.getLocationOnScreen(iArr);
                ph1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ph1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ph1Var2.h.getLocationOnScreen(iArr);
                ph1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ph1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ph1Var2.f42523f.getLocationOnScreen(iArr);
                ph1Var2.f42523f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ph1Var2.f42523f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ph1Var2.f42538n.getLocationOnScreen(iArr);
                ph1Var2.f42538n.setTranslationX((((ph1Var2.f42521e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ph1Var2.f42538n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ph1Var2.f42538n.setAlpha(1.0f);
                ph1Var2.e.setAlpha(1.0f);
                ph1Var2.h.setAlpha(1.0f);
                ph1Var2.f42523f.setAlpha(1.0f);
                long j10 = 200;
                ph1Var2.f42538n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ph1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ph1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ph1Var2.f42523f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f46068b.f42548u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ph1 ph1Var3 = this.f46068b;
                    ph1Var3.O0.setTranslationY(ph1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ph1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f46068b.f42548u0.b();
                return;
            case 11:
                ph1 ph1Var4 = this.f46068b;
                ph1Var4.f42548u0.setAlpha(1.0f);
                ph1Var4.f42548u0.invalidate();
                ValueAnimator j11 = ph1Var4.j(true);
                ph1Var4.H.setAlpha(0.0f);
                ph1Var4.I.setAlpha(0.0f);
                ph1Var4.N.setAlpha(0.0f);
                ph1Var4.X.setAlpha(0.0f);
                ph1Var4.f42532j0.setAlpha(0.0f);
                ph1Var4.f42528h0.setAlpha(0.0f);
                ph1Var4.f42530i0.setAlpha(0.0f);
                ph1Var4.K.setAlpha(0.0f);
                ph1Var4.M0.setAlpha(0.0f);
                ph1Var4.Y.f34153b0 = true;
                AndroidUtilities.runOnUIThread(new zc1(12, ph1Var4, j11), 32L);
                return;
            case 12:
                ph1 ph1Var5 = this.f46068b;
                ph1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ph1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ph1Var5.f42556z0 && ph1Var5.f42553x0 && !ph1Var5.C0 && !z10) {
                    ph1Var5.K0 = System.currentTimeMillis();
                    ph1Var5.z(false);
                    ph1Var5.f42542q0 = ph1Var5.f42541p0;
                    ph1Var5.G();
                    return;
                }
                return;
            default:
                ph1 ph1Var6 = this.f46068b;
                if (ph1Var6.f42541p0 == 3) {
                    ph1Var6.f42554y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ph1Var6.v;
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
