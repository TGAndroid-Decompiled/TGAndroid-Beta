package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class xg1 implements Runnable {
    public final int f43608a;
    public final nh1 f43609b;

    public xg1(nh1 nh1Var, int i10) {
        this.f43608a = i10;
        this.f43609b = nh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43608a) {
            case 0:
                this.f43609b.f39864u0.b();
                return;
            case 1:
                this.f43609b.f39864u0.b();
                return;
            case 2:
                this.f43609b.f39864u0.b();
                return;
            case 3:
                this.f43609b.f39864u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f43609b.Z;
                s1Var.f31846c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                nh1 nh1Var = this.f43609b;
                nh1Var.f39858q0 = nh1Var.f39857p0;
                nh1Var.G();
                return;
            case 6:
                this.f43609b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                nh1 nh1Var2 = this.f43609b;
                nh1Var2.f39837e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                nh1Var2.e.getLocationOnScreen(iArr);
                nh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                nh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                nh1Var2.h.getLocationOnScreen(iArr);
                nh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                nh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                nh1Var2.f39839f.getLocationOnScreen(iArr);
                nh1Var2.f39839f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                nh1Var2.f39839f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                nh1Var2.f39854n.getLocationOnScreen(iArr);
                nh1Var2.f39854n.setTranslationX((((nh1Var2.f39837e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                nh1Var2.f39854n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                nh1Var2.f39854n.setAlpha(1.0f);
                nh1Var2.e.setAlpha(1.0f);
                nh1Var2.h.setAlpha(1.0f);
                nh1Var2.f39839f.setAlpha(1.0f);
                long j10 = 200;
                nh1Var2.f39854n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                nh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                nh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                nh1Var2.f39839f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f43609b.f39864u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    nh1 nh1Var3 = this.f43609b;
                    nh1Var3.O0.setTranslationY(nh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    nh1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f43609b.f39864u0.b();
                return;
            case 11:
                nh1 nh1Var4 = this.f43609b;
                nh1Var4.f39864u0.setAlpha(1.0f);
                nh1Var4.f39864u0.invalidate();
                ValueAnimator j11 = nh1Var4.j(true);
                nh1Var4.H.setAlpha(0.0f);
                nh1Var4.I.setAlpha(0.0f);
                nh1Var4.N.setAlpha(0.0f);
                nh1Var4.X.setAlpha(0.0f);
                nh1Var4.f39848j0.setAlpha(0.0f);
                nh1Var4.f39844h0.setAlpha(0.0f);
                nh1Var4.f39846i0.setAlpha(0.0f);
                nh1Var4.K.setAlpha(0.0f);
                nh1Var4.M0.setAlpha(0.0f);
                nh1Var4.Y.f31844b0 = true;
                AndroidUtilities.runOnUIThread(new n71(22, nh1Var4, j11), 32L);
                return;
            case 12:
                nh1 nh1Var5 = this.f43609b;
                nh1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = nh1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nh1Var5.f39872z0 && nh1Var5.f39869x0 && !nh1Var5.C0 && !z10) {
                    nh1Var5.K0 = System.currentTimeMillis();
                    nh1Var5.z(false);
                    nh1Var5.f39858q0 = nh1Var5.f39857p0;
                    nh1Var5.G();
                    return;
                }
                return;
            default:
                nh1 nh1Var6 = this.f43609b;
                if (nh1Var6.f39857p0 == 3) {
                    nh1Var6.f39870y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = nh1Var6.v;
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
