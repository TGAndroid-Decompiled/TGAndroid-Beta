package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class vb1 implements Runnable {
    public final int f50696a;
    public final jc1 f50697b;

    public vb1(jc1 jc1Var, int i7) {
        this.f50696a = i7;
        this.f50697b = jc1Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f50696a) {
            case 0:
                this.f50697b.f46944t0.b();
                return;
            case 1:
                this.f50697b.f46944t0.b();
                return;
            case 2:
                this.f50697b.f46944t0.b();
                return;
            case 3:
                this.f50697b.f46944t0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.n1 n1Var = this.f50697b.Z;
                n1Var.f39409c0 = false;
                n1Var.invalidate();
                return;
            case 5:
                jc1 jc1Var = this.f50697b;
                jc1Var.f46938p0 = jc1Var.f46937o0;
                jc1Var.y();
                return;
            case 6:
                this.f50697b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                jc1 jc1Var2 = this.f50697b;
                jc1Var2.f46919e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                jc1Var2.f46918e.getLocationOnScreen(iArr);
                jc1Var2.f46918e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.f46918e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.h.getLocationOnScreen(iArr);
                jc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.f46921f.getLocationOnScreen(iArr);
                jc1Var2.f46921f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                jc1Var2.f46921f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.f46935n.getLocationOnScreen(iArr);
                jc1Var2.f46935n.setTranslationX((((jc1Var2.f46919e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                jc1Var2.f46935n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                jc1Var2.f46935n.setAlpha(1.0f);
                jc1Var2.f46918e.setAlpha(1.0f);
                jc1Var2.h.setAlpha(1.0f);
                jc1Var2.f46921f.setAlpha(1.0f);
                long j3 = 200;
                jc1Var2.f46935n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                jc1Var2.f46918e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                jc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                jc1Var2.f46921f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f50697b.f46944t0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.iz.f23405f1;
                if (i11 < 2) {
                    org.telegram.messenger.iz.f23405f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f23405f1);
                    edit.apply();
                    jc1 jc1Var3 = this.f50697b;
                    jc1Var3.N0.setTranslationY(jc1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    jc1Var3.N0.w();
                    return;
                }
                return;
            case 10:
                this.f50697b.f46944t0.b();
                return;
            case 11:
                jc1 jc1Var4 = this.f50697b;
                jc1Var4.f46944t0.setAlpha(1.0f);
                jc1Var4.f46944t0.invalidate();
                ValueAnimator b10 = jc1Var4.b(true);
                jc1Var4.H.setAlpha(0.0f);
                jc1Var4.I.setAlpha(0.0f);
                jc1Var4.N.setAlpha(0.0f);
                jc1Var4.X.setAlpha(0.0f);
                jc1Var4.f46928i0.setAlpha(0.0f);
                jc1Var4.f46924g0.setAlpha(0.0f);
                jc1Var4.f46926h0.setAlpha(0.0f);
                jc1Var4.K.setAlpha(0.0f);
                jc1Var4.L0.setAlpha(0.0f);
                jc1Var4.Y.f39407b0 = true;
                org.telegram.messenger.g0.i3(new sb1(1, jc1Var4, b10), 32L);
                return;
            case 12:
                jc1 jc1Var5 = this.f50697b;
                jc1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = jc1Var5.M0;
                if (zoVar != null && zoVar.V) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (jc1Var5.f46952y0 && jc1Var5.f46948w0 && !jc1Var5.B0 && !z9) {
                    jc1Var5.J0 = System.currentTimeMillis();
                    jc1Var5.r(false);
                    jc1Var5.f46938p0 = jc1Var5.f46937o0;
                    jc1Var5.y();
                    return;
                }
                return;
            case 13:
                jc1 jc1Var6 = this.f50697b;
                if (jc1Var6.f46937o0 == 3) {
                    jc1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = jc1Var6.f46947w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                jc1 jc1Var7 = this.f50697b;
                if (!jc1Var7.F0 && !jc1Var7.D0) {
                    jc1Var7.g();
                    return;
                }
                return;
        }
    }
}
