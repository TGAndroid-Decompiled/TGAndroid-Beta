package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tg1 implements Runnable {
    public final int f41775a;
    public final jh1 f41776b;

    public tg1(jh1 jh1Var, int i10) {
        this.f41775a = i10;
        this.f41776b = jh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41775a) {
            case 0:
                this.f41776b.f38226u0.b();
                return;
            case 1:
                this.f41776b.f38226u0.b();
                return;
            case 2:
                this.f41776b.f38226u0.b();
                return;
            case 3:
                this.f41776b.f38226u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f41776b.Z;
                s1Var.f31737c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                jh1 jh1Var = this.f41776b;
                jh1Var.f38220q0 = jh1Var.f38219p0;
                jh1Var.G();
                return;
            case 6:
                this.f41776b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                jh1 jh1Var2 = this.f41776b;
                jh1Var2.f38199e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                jh1Var2.e.getLocationOnScreen(iArr);
                jh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                jh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                jh1Var2.h.getLocationOnScreen(iArr);
                jh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                jh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                jh1Var2.f38201f.getLocationOnScreen(iArr);
                jh1Var2.f38201f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                jh1Var2.f38201f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                jh1Var2.f38216n.getLocationOnScreen(iArr);
                jh1Var2.f38216n.setTranslationX((((jh1Var2.f38199e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                jh1Var2.f38216n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                jh1Var2.f38216n.setAlpha(1.0f);
                jh1Var2.e.setAlpha(1.0f);
                jh1Var2.h.setAlpha(1.0f);
                jh1Var2.f38201f.setAlpha(1.0f);
                long j10 = 200;
                jh1Var2.f38216n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                jh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                jh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                jh1Var2.f38201f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f41776b.f38226u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    jh1 jh1Var3 = this.f41776b;
                    jh1Var3.O0.setTranslationY(jh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    jh1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f41776b.f38226u0.b();
                return;
            case 11:
                jh1 jh1Var4 = this.f41776b;
                jh1Var4.f38226u0.setAlpha(1.0f);
                jh1Var4.f38226u0.invalidate();
                ValueAnimator j11 = jh1Var4.j(true);
                jh1Var4.H.setAlpha(0.0f);
                jh1Var4.I.setAlpha(0.0f);
                jh1Var4.N.setAlpha(0.0f);
                jh1Var4.X.setAlpha(0.0f);
                jh1Var4.f38210j0.setAlpha(0.0f);
                jh1Var4.f38206h0.setAlpha(0.0f);
                jh1Var4.f38208i0.setAlpha(0.0f);
                jh1Var4.K.setAlpha(0.0f);
                jh1Var4.M0.setAlpha(0.0f);
                jh1Var4.Y.f31735b0 = true;
                AndroidUtilities.runOnUIThread(new m71(22, jh1Var4, j11), 32L);
                return;
            case 12:
                jh1 jh1Var5 = this.f41776b;
                jh1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = jh1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (jh1Var5.f38234z0 && jh1Var5.f38231x0 && !jh1Var5.C0 && !z10) {
                    jh1Var5.K0 = System.currentTimeMillis();
                    jh1Var5.z(false);
                    jh1Var5.f38220q0 = jh1Var5.f38219p0;
                    jh1Var5.G();
                    return;
                }
                return;
            default:
                jh1 jh1Var6 = this.f41776b;
                if (jh1Var6.f38219p0 == 3) {
                    jh1Var6.f38232y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = jh1Var6.v;
                    if (!a3Var.R) {
                        a3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
