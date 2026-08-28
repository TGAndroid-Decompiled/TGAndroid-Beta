package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wg1 implements Runnable {
    public final int f44132a;
    public final mh1 f44133b;

    public wg1(mh1 mh1Var, int i9) {
        this.f44132a = i9;
        this.f44133b = mh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44132a) {
            case 0:
                this.f44133b.f40458q0.b();
                return;
            case 1:
                this.f44133b.f40458q0.b();
                return;
            case 2:
                this.f44133b.f40458q0.b();
                return;
            case 3:
                this.f44133b.f40458q0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f44133b.V;
                s1Var.V = false;
                s1Var.invalidate();
                return;
            case 5:
                mh1 mh1Var = this.f44133b;
                mh1Var.m0 = mh1Var.f40453l0;
                mh1Var.H();
                return;
            case 6:
                this.f44133b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                mh1 mh1Var2 = this.f44133b;
                mh1Var2.f40429a0.getLocationOnScreen(iArr);
                int i9 = iArr[0];
                int i10 = iArr[1];
                mh1Var2.f40439e.getLocationOnScreen(iArr);
                mh1Var2.f40439e.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.f40439e.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.h.getLocationOnScreen(iArr);
                mh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.f40442f.getLocationOnScreen(iArr);
                mh1Var2.f40442f.setTranslationX(AndroidUtilities.dp(42.0f) + (i9 - iArr[0]));
                mh1Var2.f40442f.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.f40454n.getLocationOnScreen(iArr);
                mh1Var2.f40454n.setTranslationX((((mh1Var2.f40429a0.getWidth() + i9) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                mh1Var2.f40454n.setTranslationY(AndroidUtilities.dp(44.0f) + (i10 - iArr[1]));
                mh1Var2.f40454n.setAlpha(1.0f);
                mh1Var2.f40439e.setAlpha(1.0f);
                mh1Var2.h.setAlpha(1.0f);
                mh1Var2.f40442f.setAlpha(1.0f);
                long j10 = 200;
                mh1Var2.f40454n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.f40439e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                mh1Var2.f40442f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f44133b.f40458q0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    mh1 mh1Var3 = this.f44133b;
                    mh1Var3.K0.setTranslationY(mh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    mh1Var3.K0.v();
                    return;
                }
                return;
            case 10:
                this.f44133b.f40458q0.b();
                return;
            case 11:
                mh1 mh1Var4 = this.f44133b;
                mh1Var4.f40458q0.setAlpha(1.0f);
                mh1Var4.f40458q0.invalidate();
                ValueAnimator k10 = mh1Var4.k(true);
                mh1Var4.D.setAlpha(0.0f);
                mh1Var4.E.setAlpha(0.0f);
                mh1Var4.J.setAlpha(0.0f);
                mh1Var4.T.setAlpha(0.0f);
                mh1Var4.f40443f0.setAlpha(0.0f);
                mh1Var4.f40437d0.setAlpha(0.0f);
                mh1Var4.f40440e0.setAlpha(0.0f);
                mh1Var4.G.setAlpha(0.0f);
                mh1Var4.I0.setAlpha(0.0f);
                mh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new n21(28, mh1Var4, k10), 32L);
                return;
            case 12:
                mh1 mh1Var5 = this.f44133b;
                mh1Var5.N0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = mh1Var5.J0;
                if (c3Var != null && c3Var.R) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mh1Var5.f40465v0 && mh1Var5.f40463t0 && !mh1Var5.f40471y0 && !z10) {
                    mh1Var5.G0 = System.currentTimeMillis();
                    mh1Var5.A(false);
                    mh1Var5.m0 = mh1Var5.f40453l0;
                    mh1Var5.H();
                    return;
                }
                return;
            default:
                mh1 mh1Var6 = this.f44133b;
                if (mh1Var6.f40453l0 == 3) {
                    mh1Var6.f40470y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = mh1Var6.v;
                    if (!b3Var.N) {
                        b3Var.N = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
