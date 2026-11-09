package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class tb1 implements Runnable {
    public final int f50152a;
    public final ic1 f50153b;

    public tb1(ic1 ic1Var, int i7) {
        this.f50152a = i7;
        this.f50153b = ic1Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f50152a) {
            case 0:
                this.f50153b.f46608t0.b();
                return;
            case 1:
                this.f50153b.f46608t0.b();
                return;
            case 2:
                this.f50153b.f46608t0.b();
                return;
            case 3:
                this.f50153b.f46608t0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.n1 n1Var = this.f50153b.Z;
                n1Var.f39489c0 = false;
                n1Var.invalidate();
                return;
            case 5:
                ic1 ic1Var = this.f50153b;
                ic1Var.f46602p0 = ic1Var.f46601o0;
                ic1Var.y();
                return;
            case 6:
                this.f50153b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                ic1 ic1Var2 = this.f50153b;
                ic1Var2.f46583e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                ic1Var2.f46582e.getLocationOnScreen(iArr);
                ic1Var2.f46582e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.f46582e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.h.getLocationOnScreen(iArr);
                ic1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.f46585f.getLocationOnScreen(iArr);
                ic1Var2.f46585f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ic1Var2.f46585f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.f46599n.getLocationOnScreen(iArr);
                ic1Var2.f46599n.setTranslationX((((ic1Var2.f46583e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                ic1Var2.f46599n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ic1Var2.f46599n.setAlpha(1.0f);
                ic1Var2.f46582e.setAlpha(1.0f);
                ic1Var2.h.setAlpha(1.0f);
                ic1Var2.f46585f.setAlpha(1.0f);
                long j3 = 200;
                ic1Var2.f46599n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ic1Var2.f46582e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ic1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ic1Var2.f46585f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f50153b.f46608t0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.iz.f23401f1;
                if (i11 < 2) {
                    org.telegram.messenger.iz.f23401f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f23401f1);
                    edit.apply();
                    ic1 ic1Var3 = this.f50153b;
                    ic1Var3.N0.setTranslationY(ic1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    ic1Var3.N0.w();
                    return;
                }
                return;
            case 10:
                this.f50153b.f46608t0.b();
                return;
            case 11:
                ic1 ic1Var4 = this.f50153b;
                ic1Var4.f46608t0.setAlpha(1.0f);
                ic1Var4.f46608t0.invalidate();
                ValueAnimator b10 = ic1Var4.b(true);
                ic1Var4.H.setAlpha(0.0f);
                ic1Var4.I.setAlpha(0.0f);
                ic1Var4.N.setAlpha(0.0f);
                ic1Var4.X.setAlpha(0.0f);
                ic1Var4.f46592i0.setAlpha(0.0f);
                ic1Var4.f46588g0.setAlpha(0.0f);
                ic1Var4.f46590h0.setAlpha(0.0f);
                ic1Var4.K.setAlpha(0.0f);
                ic1Var4.L0.setAlpha(0.0f);
                ic1Var4.Y.f39487b0 = true;
                org.telegram.messenger.g0.i3(new wb1(0, ic1Var4, b10), 32L);
                return;
            case 12:
                ic1 ic1Var5 = this.f50153b;
                ic1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = ic1Var5.M0;
                if (zoVar != null && zoVar.V) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (ic1Var5.f46616y0 && ic1Var5.f46612w0 && !ic1Var5.B0 && !z9) {
                    ic1Var5.J0 = System.currentTimeMillis();
                    ic1Var5.r(false);
                    ic1Var5.f46602p0 = ic1Var5.f46601o0;
                    ic1Var5.y();
                    return;
                }
                return;
            case 13:
                ic1 ic1Var6 = this.f50153b;
                if (ic1Var6.f46601o0 == 3) {
                    ic1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = ic1Var6.f46611w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                ic1 ic1Var7 = this.f50153b;
                if (!ic1Var7.F0 && !ic1Var7.D0) {
                    ic1Var7.g();
                    return;
                }
                return;
        }
    }
}
