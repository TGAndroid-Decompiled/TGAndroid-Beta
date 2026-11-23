package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class rb1 implements Runnable {
    public final int f51687a;
    public final fc1 f51688b;

    public rb1(fc1 fc1Var, int i7) {
        this.f51687a = i7;
        this.f51688b = fc1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f51687a) {
            case 0:
                this.f51688b.f47790u0.b();
                return;
            case 1:
                this.f51688b.f47790u0.b();
                return;
            case 2:
                this.f51688b.f47790u0.b();
                return;
            case 3:
                this.f51688b.f47790u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.r1 r1Var = this.f51688b.f47753a0;
                r1Var.f41177d0 = false;
                r1Var.invalidate();
                return;
            case 5:
                fc1 fc1Var = this.f51688b;
                fc1Var.f47784q0 = fc1Var.f47783p0;
                fc1Var.y();
                return;
            case 6:
                this.f51688b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                fc1 fc1Var2 = this.f51688b;
                fc1Var2.f47767f0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                fc1Var2.f47763e.getLocationOnScreen(iArr);
                fc1Var2.f47763e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.f47763e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.h.getLocationOnScreen(iArr);
                fc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f47766f.getLocationOnScreen(iArr);
                fc1Var2.f47766f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                fc1Var2.f47766f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f47780n.getLocationOnScreen(iArr);
                fc1Var2.f47780n.setTranslationX((((fc1Var2.f47767f0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                fc1Var2.f47780n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                fc1Var2.f47780n.setAlpha(1.0f);
                fc1Var2.f47763e.setAlpha(1.0f);
                fc1Var2.h.setAlpha(1.0f);
                fc1Var2.f47766f.setAlpha(1.0f);
                long j3 = 200;
                fc1Var2.f47780n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.f47763e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                fc1Var2.f47766f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f51688b.f47790u0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.bz.f23286f1;
                if (i11 < 2) {
                    org.telegram.messenger.bz.f23286f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.bz.f23286f1);
                    edit.apply();
                    fc1 fc1Var3 = this.f51688b;
                    fc1Var3.O0.setTranslationY(fc1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    fc1Var3.O0.x();
                    return;
                }
                return;
            case 10:
                this.f51688b.f47790u0.b();
                return;
            case 11:
                fc1 fc1Var4 = this.f51688b;
                fc1Var4.f47790u0.setAlpha(1.0f);
                fc1Var4.f47790u0.invalidate();
                ValueAnimator b10 = fc1Var4.b(true);
                fc1Var4.I.setAlpha(0.0f);
                fc1Var4.J.setAlpha(0.0f);
                fc1Var4.O.setAlpha(0.0f);
                fc1Var4.Y.setAlpha(0.0f);
                fc1Var4.f47775j0.setAlpha(0.0f);
                fc1Var4.f47771h0.setAlpha(0.0f);
                fc1Var4.f47773i0.setAlpha(0.0f);
                fc1Var4.L.setAlpha(0.0f);
                fc1Var4.M0.setAlpha(0.0f);
                fc1Var4.Z.f41176c0 = true;
                org.telegram.messenger.g0.h3(new iy0(27, fc1Var4, b10), 32L);
                return;
            case 12:
                fc1 fc1Var5 = this.f51688b;
                fc1Var5.R0 = false;
                org.telegram.ui.Components.op opVar = fc1Var5.N0;
                if (opVar != null && opVar.W) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (fc1Var5.f47798z0 && fc1Var5.f47795x0 && !fc1Var5.C0 && !z10) {
                    fc1Var5.K0 = System.currentTimeMillis();
                    fc1Var5.r(false);
                    fc1Var5.f47784q0 = fc1Var5.f47783p0;
                    fc1Var5.y();
                    return;
                }
                return;
            case 13:
                fc1 fc1Var6 = this.f51688b;
                if (fc1Var6.f47783p0 == 3) {
                    fc1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.y2 y2Var = fc1Var6.f47792w;
                    if (!y2Var.S) {
                        y2Var.S = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                fc1 fc1Var7 = this.f51688b;
                if (!fc1Var7.G0 && !fc1Var7.E0) {
                    fc1Var7.g();
                    return;
                }
                return;
        }
    }
}
