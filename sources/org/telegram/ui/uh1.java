package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class uh1 implements Runnable {
    public final int f38259a;
    public final ki1 f38260b;

    public uh1(ki1 ki1Var, int i10) {
        this.f38259a = i10;
        this.f38260b = ki1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38259a) {
            case 0:
                this.f38260b.f35082u0.b();
                return;
            case 1:
                this.f38260b.f35082u0.b();
                return;
            case 2:
                this.f38260b.f35082u0.b();
                return;
            case 3:
                this.f38260b.f35082u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f38260b.Z;
                v1Var.f29637c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                ki1 ki1Var = this.f38260b;
                ki1Var.f35076q0 = ki1Var.f35075p0;
                ki1Var.H();
                return;
            case 6:
                this.f38260b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ki1 ki1Var2 = this.f38260b;
                ki1Var2.f35055e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ki1Var2.e.getLocationOnScreen(iArr);
                ki1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.h.getLocationOnScreen(iArr);
                ki1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.f35057f.getLocationOnScreen(iArr);
                ki1Var2.f35057f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ki1Var2.f35057f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.f35072n.getLocationOnScreen(iArr);
                ki1Var2.f35072n.setTranslationX((((ki1Var2.f35055e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ki1Var2.f35072n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ki1Var2.f35072n.setAlpha(1.0f);
                ki1Var2.e.setAlpha(1.0f);
                ki1Var2.h.setAlpha(1.0f);
                ki1Var2.f35057f.setAlpha(1.0f);
                long j3 = 200;
                ki1Var2.f35072n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ki1Var2.f35057f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f38260b.f35082u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ki1 ki1Var3 = this.f38260b;
                    ki1Var3.O0.setTranslationY(ki1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ki1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38260b.f35082u0.b();
                return;
            case 11:
                ki1 ki1Var4 = this.f38260b;
                ki1Var4.f35082u0.setAlpha(1.0f);
                ki1Var4.f35082u0.invalidate();
                ValueAnimator k10 = ki1Var4.k(true);
                ki1Var4.H.setAlpha(0.0f);
                ki1Var4.I.setAlpha(0.0f);
                ki1Var4.N.setAlpha(0.0f);
                ki1Var4.X.setAlpha(0.0f);
                ki1Var4.f35066j0.setAlpha(0.0f);
                ki1Var4.f35062h0.setAlpha(0.0f);
                ki1Var4.f35064i0.setAlpha(0.0f);
                ki1Var4.K.setAlpha(0.0f);
                ki1Var4.M0.setAlpha(0.0f);
                ki1Var4.Y.f29635b0 = true;
                AndroidUtilities.runOnUIThread(new fb1(17, ki1Var4, k10), 32L);
                return;
            case 12:
                ki1 ki1Var5 = this.f38260b;
                ki1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ki1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ki1Var5.f35090z0 && ki1Var5.f35087x0 && !ki1Var5.C0 && !z10) {
                    ki1Var5.K0 = System.currentTimeMillis();
                    ki1Var5.A(false);
                    ki1Var5.f35076q0 = ki1Var5.f35075p0;
                    ki1Var5.H();
                    return;
                }
                return;
            default:
                ki1 ki1Var6 = this.f38260b;
                if (ki1Var6.f35075p0 == 3) {
                    ki1Var6.f35088y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ki1Var6.v;
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
