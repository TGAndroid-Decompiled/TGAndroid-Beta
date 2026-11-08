package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class rb1 implements Runnable {
    public final int f49431a;
    public final fc1 f49432b;

    public rb1(fc1 fc1Var, int i7) {
        this.f49431a = i7;
        this.f49432b = fc1Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f49431a) {
            case 0:
                this.f49432b.f45576t0.b();
                return;
            case 1:
                this.f49432b.f45576t0.b();
                return;
            case 2:
                this.f49432b.f45576t0.b();
                return;
            case 3:
                this.f49432b.f45576t0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.n1 n1Var = this.f49432b.Z;
                n1Var.f39400c0 = false;
                n1Var.invalidate();
                return;
            case 5:
                fc1 fc1Var = this.f49432b;
                fc1Var.f45570p0 = fc1Var.f45569o0;
                fc1Var.y();
                return;
            case 6:
                this.f49432b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                fc1 fc1Var2 = this.f49432b;
                fc1Var2.f45551e0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                fc1Var2.f45550e.getLocationOnScreen(iArr);
                fc1Var2.f45550e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.f45550e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.h.getLocationOnScreen(iArr);
                fc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f45553f.getLocationOnScreen(iArr);
                fc1Var2.f45553f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.f45553f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f45567n.getLocationOnScreen(iArr);
                fc1Var2.f45567n.setTranslationX((((fc1Var2.f45551e0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                fc1Var2.f45567n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f45567n.setAlpha(1.0f);
                fc1Var2.f45550e.setAlpha(1.0f);
                fc1Var2.h.setAlpha(1.0f);
                fc1Var2.f45553f.setAlpha(1.0f);
                long j3 = 200;
                fc1Var2.f45567n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.f45550e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.f45553f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f49432b.f45576t0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.iz.f23401f1;
                if (i11 < 2) {
                    org.telegram.messenger.iz.f23401f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f23401f1);
                    edit.apply();
                    fc1 fc1Var3 = this.f49432b;
                    fc1Var3.N0.setTranslationY(fc1Var3.N.getY() + org.telegram.messenger.g0.L(36.0f));
                    fc1Var3.N0.w();
                    return;
                }
                return;
            case 10:
                this.f49432b.f45576t0.b();
                return;
            case 11:
                fc1 fc1Var4 = this.f49432b;
                fc1Var4.f45576t0.setAlpha(1.0f);
                fc1Var4.f45576t0.invalidate();
                ValueAnimator b10 = fc1Var4.b(true);
                fc1Var4.H.setAlpha(0.0f);
                fc1Var4.I.setAlpha(0.0f);
                fc1Var4.N.setAlpha(0.0f);
                fc1Var4.X.setAlpha(0.0f);
                fc1Var4.f45560i0.setAlpha(0.0f);
                fc1Var4.f45556g0.setAlpha(0.0f);
                fc1Var4.f45558h0.setAlpha(0.0f);
                fc1Var4.K.setAlpha(0.0f);
                fc1Var4.L0.setAlpha(0.0f);
                fc1Var4.Y.f39398b0 = true;
                org.telegram.messenger.g0.i3(new by0(29, fc1Var4, b10), 32L);
                return;
            case 12:
                fc1 fc1Var5 = this.f49432b;
                fc1Var5.Q0 = false;
                org.telegram.ui.Components.zo zoVar = fc1Var5.M0;
                if (zoVar != null && zoVar.V) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (fc1Var5.f45584y0 && fc1Var5.f45580w0 && !fc1Var5.B0 && !z9) {
                    fc1Var5.J0 = System.currentTimeMillis();
                    fc1Var5.r(false);
                    fc1Var5.f45570p0 = fc1Var5.f45569o0;
                    fc1Var5.y();
                    return;
                }
                return;
            case 13:
                fc1 fc1Var6 = this.f49432b;
                if (fc1Var6.f45569o0 == 3) {
                    fc1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.u2 u2Var = fc1Var6.f45579w;
                    if (!u2Var.R) {
                        u2Var.R = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                fc1 fc1Var7 = this.f49432b;
                if (!fc1Var7.F0 && !fc1Var7.D0) {
                    fc1Var7.g();
                    return;
                }
                return;
        }
    }
}
