package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class sh1 implements Runnable {
    public final int f38230a;
    public final ii1 f38231b;

    public sh1(ii1 ii1Var, int i10) {
        this.f38230a = i10;
        this.f38231b = ii1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f38230a) {
            case 0:
                this.f38231b.f34976r0.b();
                return;
            case 1:
                this.f38231b.f34976r0.b();
                return;
            case 2:
                this.f38231b.f34976r0.b();
                return;
            case 3:
                this.f38231b.f34976r0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f38231b.W;
                s1Var.W = false;
                s1Var.invalidate();
                return;
            case 5:
                ii1 ii1Var = this.f38231b;
                ii1Var.f34971n0 = ii1Var.m0;
                ii1Var.H();
                return;
            case 6:
                this.f38231b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ii1 ii1Var2 = this.f38231b;
                ii1Var2.f34948b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ii1Var2.e.getLocationOnScreen(iArr);
                ii1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.h.getLocationOnScreen(iArr);
                ii1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.f34957f.getLocationOnScreen(iArr);
                ii1Var2.f34957f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ii1Var2.f34957f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.f34970n.getLocationOnScreen(iArr);
                ii1Var2.f34970n.setTranslationX((((ii1Var2.f34948b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ii1Var2.f34970n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ii1Var2.f34970n.setAlpha(1.0f);
                ii1Var2.e.setAlpha(1.0f);
                ii1Var2.h.setAlpha(1.0f);
                ii1Var2.f34957f.setAlpha(1.0f);
                long j10 = 200;
                ii1Var2.f34970n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ii1Var2.f34957f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f38231b.f34976r0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ii1 ii1Var3 = this.f38231b;
                    ii1Var3.L0.setTranslationY(ii1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ii1Var3.L0.u();
                    return;
                }
                return;
            case 10:
                this.f38231b.f34976r0.b();
                return;
            case 11:
                ii1 ii1Var4 = this.f38231b;
                ii1Var4.f34976r0.setAlpha(1.0f);
                ii1Var4.f34976r0.invalidate();
                ValueAnimator k10 = ii1Var4.k(true);
                ii1Var4.E.setAlpha(0.0f);
                ii1Var4.F.setAlpha(0.0f);
                ii1Var4.K.setAlpha(0.0f);
                ii1Var4.U.setAlpha(0.0f);
                ii1Var4.f34960g0.setAlpha(0.0f);
                ii1Var4.f34955e0.setAlpha(0.0f);
                ii1Var4.f34958f0.setAlpha(0.0f);
                ii1Var4.H.setAlpha(0.0f);
                ii1Var4.J0.setAlpha(0.0f);
                ii1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new sg1(3, ii1Var4, k10), 32L);
                return;
            case 12:
                ii1 ii1Var5 = this.f38231b;
                ii1Var5.O0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ii1Var5.K0;
                if (d3Var != null && d3Var.S) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ii1Var5.f34983w0 && ii1Var5.f34980u0 && !ii1Var5.f34988z0 && !z4) {
                    ii1Var5.H0 = System.currentTimeMillis();
                    ii1Var5.A(false);
                    ii1Var5.f34971n0 = ii1Var5.m0;
                    ii1Var5.H();
                    return;
                }
                return;
            default:
                ii1 ii1Var6 = this.f38231b;
                if (ii1Var6.m0 == 3) {
                    ii1Var6.f34986y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ii1Var6.v;
                    if (!c3Var.O) {
                        c3Var.O = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
