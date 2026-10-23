package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yg1 implements Runnable {
    public final int f43855a;
    public final oh1 f43856b;

    public yg1(oh1 oh1Var, int i10) {
        this.f43855a = i10;
        this.f43856b = oh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43855a) {
            case 0:
                this.f43856b.f40201u0.b();
                return;
            case 1:
                this.f43856b.f40201u0.b();
                return;
            case 2:
                this.f43856b.f40201u0.b();
                return;
            case 3:
                this.f43856b.f40201u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f43856b.Z;
                s1Var.f31876c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                oh1 oh1Var = this.f43856b;
                oh1Var.f40195q0 = oh1Var.f40194p0;
                oh1Var.G();
                return;
            case 6:
                this.f43856b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                oh1 oh1Var2 = this.f43856b;
                oh1Var2.f40174e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                oh1Var2.e.getLocationOnScreen(iArr);
                oh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.h.getLocationOnScreen(iArr);
                oh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f40176f.getLocationOnScreen(iArr);
                oh1Var2.f40176f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.f40176f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f40191n.getLocationOnScreen(iArr);
                oh1Var2.f40191n.setTranslationX((((oh1Var2.f40174e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                oh1Var2.f40191n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f40191n.setAlpha(1.0f);
                oh1Var2.e.setAlpha(1.0f);
                oh1Var2.h.setAlpha(1.0f);
                oh1Var2.f40176f.setAlpha(1.0f);
                long j10 = 200;
                oh1Var2.f40191n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.f40176f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f43856b.f40201u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    oh1 oh1Var3 = this.f43856b;
                    oh1Var3.O0.setTranslationY(oh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    oh1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f43856b.f40201u0.b();
                return;
            case 11:
                oh1 oh1Var4 = this.f43856b;
                oh1Var4.f40201u0.setAlpha(1.0f);
                oh1Var4.f40201u0.invalidate();
                ValueAnimator j11 = oh1Var4.j(true);
                oh1Var4.H.setAlpha(0.0f);
                oh1Var4.I.setAlpha(0.0f);
                oh1Var4.N.setAlpha(0.0f);
                oh1Var4.X.setAlpha(0.0f);
                oh1Var4.f40185j0.setAlpha(0.0f);
                oh1Var4.f40181h0.setAlpha(0.0f);
                oh1Var4.f40183i0.setAlpha(0.0f);
                oh1Var4.K.setAlpha(0.0f);
                oh1Var4.M0.setAlpha(0.0f);
                oh1Var4.Y.f31874b0 = true;
                AndroidUtilities.runOnUIThread(new o71(22, oh1Var4, j11), 32L);
                return;
            case 12:
                oh1 oh1Var5 = this.f43856b;
                oh1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = oh1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (oh1Var5.f40209z0 && oh1Var5.f40206x0 && !oh1Var5.C0 && !z10) {
                    oh1Var5.K0 = System.currentTimeMillis();
                    oh1Var5.z(false);
                    oh1Var5.f40195q0 = oh1Var5.f40194p0;
                    oh1Var5.G();
                    return;
                }
                return;
            default:
                oh1 oh1Var6 = this.f43856b;
                if (oh1Var6.f40194p0 == 3) {
                    oh1Var6.f40207y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = oh1Var6.v;
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
