package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class rg1 implements Runnable {
    public final int f41212a;
    public final hh1 f41213b;

    public rg1(hh1 hh1Var, int i10) {
        this.f41212a = i10;
        this.f41213b = hh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41212a) {
            case 0:
                this.f41213b.f37690u0.b();
                return;
            case 1:
                this.f41213b.f37690u0.b();
                return;
            case 2:
                this.f41213b.f37690u0.b();
                return;
            case 3:
                this.f41213b.f37690u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f41213b.Z;
                s1Var.f31741c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                hh1 hh1Var = this.f41213b;
                hh1Var.f37684q0 = hh1Var.f37683p0;
                hh1Var.G();
                return;
            case 6:
                this.f41213b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                hh1 hh1Var2 = this.f41213b;
                hh1Var2.f37663e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                hh1Var2.e.getLocationOnScreen(iArr);
                hh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.h.getLocationOnScreen(iArr);
                hh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.f37665f.getLocationOnScreen(iArr);
                hh1Var2.f37665f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                hh1Var2.f37665f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.f37680n.getLocationOnScreen(iArr);
                hh1Var2.f37680n.setTranslationX((((hh1Var2.f37663e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                hh1Var2.f37680n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                hh1Var2.f37680n.setAlpha(1.0f);
                hh1Var2.e.setAlpha(1.0f);
                hh1Var2.h.setAlpha(1.0f);
                hh1Var2.f37665f.setAlpha(1.0f);
                long j10 = 200;
                hh1Var2.f37680n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                hh1Var2.f37665f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f41213b.f37690u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    hh1 hh1Var3 = this.f41213b;
                    hh1Var3.O0.setTranslationY(hh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    hh1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f41213b.f37690u0.b();
                return;
            case 11:
                hh1 hh1Var4 = this.f41213b;
                hh1Var4.f37690u0.setAlpha(1.0f);
                hh1Var4.f37690u0.invalidate();
                ValueAnimator j11 = hh1Var4.j(true);
                hh1Var4.H.setAlpha(0.0f);
                hh1Var4.I.setAlpha(0.0f);
                hh1Var4.N.setAlpha(0.0f);
                hh1Var4.X.setAlpha(0.0f);
                hh1Var4.f37674j0.setAlpha(0.0f);
                hh1Var4.f37670h0.setAlpha(0.0f);
                hh1Var4.f37672i0.setAlpha(0.0f);
                hh1Var4.K.setAlpha(0.0f);
                hh1Var4.M0.setAlpha(0.0f);
                hh1Var4.Y.f31739b0 = true;
                AndroidUtilities.runOnUIThread(new k71(22, hh1Var4, j11), 32L);
                return;
            case 12:
                hh1 hh1Var5 = this.f41213b;
                hh1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = hh1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hh1Var5.f37698z0 && hh1Var5.f37695x0 && !hh1Var5.C0 && !z10) {
                    hh1Var5.K0 = System.currentTimeMillis();
                    hh1Var5.z(false);
                    hh1Var5.f37684q0 = hh1Var5.f37683p0;
                    hh1Var5.G();
                    return;
                }
                return;
            default:
                hh1 hh1Var6 = this.f41213b;
                if (hh1Var6.f37683p0 == 3) {
                    hh1Var6.f37696y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = hh1Var6.v;
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
