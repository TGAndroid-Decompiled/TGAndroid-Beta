package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yg1 implements Runnable {
    public final int f44879a;
    public final oh1 f44880b;

    public yg1(oh1 oh1Var, int i10) {
        this.f44879a = i10;
        this.f44880b = oh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44879a) {
            case 0:
                this.f44880b.f41166q0.b();
                return;
            case 1:
                this.f44880b.f41166q0.b();
                return;
            case 2:
                this.f44880b.f41166q0.b();
                return;
            case 3:
                this.f44880b.f41166q0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.f44880b.V;
                t1Var.V = false;
                t1Var.invalidate();
                return;
            case 5:
                oh1 oh1Var = this.f44880b;
                oh1Var.m0 = oh1Var.f41161l0;
                oh1Var.H();
                return;
            case 6:
                this.f44880b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                oh1 oh1Var2 = this.f44880b;
                oh1Var2.f41137a0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                oh1Var2.f41147e.getLocationOnScreen(iArr);
                oh1Var2.f41147e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.f41147e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.h.getLocationOnScreen(iArr);
                oh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f41150f.getLocationOnScreen(iArr);
                oh1Var2.f41150f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                oh1Var2.f41150f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f41162n.getLocationOnScreen(iArr);
                oh1Var2.f41162n.setTranslationX((((oh1Var2.f41137a0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                oh1Var2.f41162n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                oh1Var2.f41162n.setAlpha(1.0f);
                oh1Var2.f41147e.setAlpha(1.0f);
                oh1Var2.h.setAlpha(1.0f);
                oh1Var2.f41150f.setAlpha(1.0f);
                long j10 = 200;
                oh1Var2.f41162n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.f41147e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                oh1Var2.f41150f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f44880b.f41166q0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    oh1 oh1Var3 = this.f44880b;
                    oh1Var3.K0.setTranslationY(oh1Var3.J.getY() + AndroidUtilities.dp(36.0f));
                    oh1Var3.K0.v();
                    return;
                }
                return;
            case 10:
                this.f44880b.f41166q0.b();
                return;
            case 11:
                oh1 oh1Var4 = this.f44880b;
                oh1Var4.f41166q0.setAlpha(1.0f);
                oh1Var4.f41166q0.invalidate();
                ValueAnimator k9 = oh1Var4.k(true);
                oh1Var4.D.setAlpha(0.0f);
                oh1Var4.E.setAlpha(0.0f);
                oh1Var4.J.setAlpha(0.0f);
                oh1Var4.T.setAlpha(0.0f);
                oh1Var4.f41151f0.setAlpha(0.0f);
                oh1Var4.f41145d0.setAlpha(0.0f);
                oh1Var4.f41148e0.setAlpha(0.0f);
                oh1Var4.G.setAlpha(0.0f);
                oh1Var4.I0.setAlpha(0.0f);
                oh1Var4.U.U = true;
                AndroidUtilities.runOnUIThread(new t31(25, oh1Var4, k9), 32L);
                return;
            case 12:
                oh1 oh1Var5 = this.f44880b;
                oh1Var5.N0 = false;
                org.telegram.ui.Components.voip.f3 f3Var = oh1Var5.J0;
                if (f3Var != null && f3Var.R) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (oh1Var5.f41173v0 && oh1Var5.f41171t0 && !oh1Var5.f41179y0 && !z10) {
                    oh1Var5.G0 = System.currentTimeMillis();
                    oh1Var5.A(false);
                    oh1Var5.m0 = oh1Var5.f41161l0;
                    oh1Var5.H();
                    return;
                }
                return;
            default:
                oh1 oh1Var6 = this.f44880b;
                if (oh1Var6.f41161l0 == 3) {
                    oh1Var6.f41178y.b(true, false);
                    org.telegram.ui.Components.voip.e3 e3Var = oh1Var6.v;
                    if (!e3Var.N) {
                        e3Var.N = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
