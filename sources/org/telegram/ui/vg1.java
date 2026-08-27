package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class vg1 implements Runnable {

    public final int f43459a;

    public final lh1 f43460b;

    public vg1(lh1 lh1Var, int i10) {
        this.f43459a = i10;
        this.f43460b = lh1Var;
    }

    @Override
    public final void run() {
        switch (this.f43459a) {
            case 0:
                this.f43460b.f40119q0.b();
                break;
            case 1:
                this.f43460b.f40119q0.b();
                break;
            case 2:
                this.f43460b.f40119q0.b();
                break;
            case 3:
                this.f43460b.f40119q0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f43460b.V;
                s1Var.V = false;
                s1Var.invalidate();
                break;
            case 5:
                lh1 lh1Var = this.f43460b;
                lh1Var.m0 = lh1Var.f40114l0;
                lh1Var.H();
                break;
            case 6:
                this.f43460b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                lh1 lh1Var2 = this.f43460b;
                lh1Var2.f40090a0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                lh1Var2.f40100e.getLocationOnScreen(iArr);
                lh1Var2.f40100e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.f40100e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.h.getLocationOnScreen(iArr);
                lh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.f40103f.getLocationOnScreen(iArr);
                lh1Var2.f40103f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                lh1Var2.f40103f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.f40115n.getLocationOnScreen(iArr);
                lh1Var2.f40115n.setTranslationX((((lh1Var2.f40090a0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                lh1Var2.f40115n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                lh1Var2.f40115n.setAlpha(1.0f);
                lh1Var2.f40100e.setAlpha(1.0f);
                lh1Var2.h.setAlpha(1.0f);
                lh1Var2.f40103f.setAlpha(1.0f);
                long j10 = 200;
                lh1Var2.f40115n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.f40100e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                lh1Var2.f40103f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.f43460b.f40119q0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    lh1 lh1Var3 = this.f43460b;
                    lh1Var3.K0.setTranslationY(lh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    lh1Var3.K0.v();
                }
                break;
            case 10:
                this.f43460b.f40119q0.b();
                break;
            case 11:
                lh1 lh1Var4 = this.f43460b;
                lh1Var4.f40119q0.setAlpha(1.0f);
                lh1Var4.f40119q0.invalidate();
                ValueAnimator valueAnimatorK = lh1Var4.k(true);
                lh1Var4.D.setAlpha(0.0f);
                lh1Var4.E.setAlpha(0.0f);
                lh1Var4.J.setAlpha(0.0f);
                lh1Var4.T.setAlpha(0.0f);
                lh1Var4.f40104f0.setAlpha(0.0f);
                lh1Var4.f40098d0.setAlpha(0.0f);
                lh1Var4.f40101e0.setAlpha(0.0f);
                lh1Var4.G.setAlpha(0.0f);
                lh1Var4.I0.setAlpha(0.0f);
                lh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new m21(28, lh1Var4, valueAnimatorK), 32L);
                break;
            case 12:
                lh1 lh1Var5 = this.f43460b;
                lh1Var5.N0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = lh1Var5.J0;
                boolean z10 = c3Var != null && c3Var.R;
                if (lh1Var5.f40126v0 && lh1Var5.f40124t0 && !lh1Var5.f40132y0 && !z10) {
                    lh1Var5.G0 = System.currentTimeMillis();
                    lh1Var5.A(false);
                    lh1Var5.m0 = lh1Var5.f40114l0;
                    lh1Var5.H();
                    break;
                }
                break;
            default:
                lh1 lh1Var6 = this.f43460b;
                if (lh1Var6.f40114l0 == 3) {
                    lh1Var6.f40131y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = lh1Var6.v;
                    if (!b3Var.N) {
                        b3Var.N = true;
                        break;
                    }
                }
                break;
        }
    }
}
