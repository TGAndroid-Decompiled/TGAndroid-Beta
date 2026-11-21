package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class tb1 implements Runnable {
    public final int f52294a;
    public final hc1 f52295b;

    public tb1(hc1 hc1Var, int i7) {
        this.f52294a = i7;
        this.f52295b = hc1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f52294a) {
            case 0:
                this.f52295b.f48364u0.b();
                return;
            case 1:
                this.f52295b.f48364u0.b();
                return;
            case 2:
                this.f52295b.f48364u0.b();
                return;
            case 3:
                this.f52295b.f48364u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.q1 q1Var = this.f52295b.f48327a0;
                q1Var.f41280d0 = false;
                q1Var.invalidate();
                return;
            case 5:
                hc1 hc1Var = this.f52295b;
                hc1Var.f48358q0 = hc1Var.f48357p0;
                hc1Var.y();
                return;
            case 6:
                this.f52295b.s();
                return;
            case 7:
                int[] iArr = new int[2];
                hc1 hc1Var2 = this.f52295b;
                hc1Var2.f48341f0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                hc1Var2.f48337e.getLocationOnScreen(iArr);
                hc1Var2.f48337e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.f48337e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.h.getLocationOnScreen(iArr);
                hc1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.f48340f.getLocationOnScreen(iArr);
                hc1Var2.f48340f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                hc1Var2.f48340f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.f48354n.getLocationOnScreen(iArr);
                hc1Var2.f48354n.setTranslationX((((hc1Var2.f48341f0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                hc1Var2.f48354n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                hc1Var2.f48354n.setAlpha(1.0f);
                hc1Var2.f48337e.setAlpha(1.0f);
                hc1Var2.h.setAlpha(1.0f);
                hc1Var2.f48340f.setAlpha(1.0f);
                long j3 = 200;
                hc1Var2.f48354n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                hc1Var2.f48337e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                hc1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                hc1Var2.f48340f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f52295b.f48364u0.b();
                return;
            case 9:
                int i11 = org.telegram.messenger.bz.f23189f1;
                if (i11 < 2) {
                    org.telegram.messenger.bz.f23189f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.bz.f23189f1);
                    edit.apply();
                    hc1 hc1Var3 = this.f52295b;
                    hc1Var3.O0.setTranslationY(hc1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    hc1Var3.O0.x();
                    return;
                }
                return;
            case 10:
                this.f52295b.f48364u0.b();
                return;
            case 11:
                hc1 hc1Var4 = this.f52295b;
                hc1Var4.f48364u0.setAlpha(1.0f);
                hc1Var4.f48364u0.invalidate();
                ValueAnimator b10 = hc1Var4.b(true);
                hc1Var4.I.setAlpha(0.0f);
                hc1Var4.J.setAlpha(0.0f);
                hc1Var4.O.setAlpha(0.0f);
                hc1Var4.Y.setAlpha(0.0f);
                hc1Var4.f48349j0.setAlpha(0.0f);
                hc1Var4.f48345h0.setAlpha(0.0f);
                hc1Var4.f48347i0.setAlpha(0.0f);
                hc1Var4.L.setAlpha(0.0f);
                hc1Var4.M0.setAlpha(0.0f);
                hc1Var4.Z.f41279c0 = true;
                org.telegram.messenger.g0.h3(new mz0(23, hc1Var4, b10), 32L);
                return;
            case 12:
                hc1 hc1Var5 = this.f52295b;
                hc1Var5.R0 = false;
                org.telegram.ui.Components.rp rpVar = hc1Var5.N0;
                if (rpVar != null && rpVar.W) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hc1Var5.f48372z0 && hc1Var5.f48369x0 && !hc1Var5.C0 && !z10) {
                    hc1Var5.K0 = System.currentTimeMillis();
                    hc1Var5.r(false);
                    hc1Var5.f48358q0 = hc1Var5.f48357p0;
                    hc1Var5.y();
                    return;
                }
                return;
            case 13:
                hc1 hc1Var6 = this.f52295b;
                if (hc1Var6.f48357p0 == 3) {
                    hc1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.x2 x2Var = hc1Var6.f48366w;
                    if (!x2Var.S) {
                        x2Var.S = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                hc1 hc1Var7 = this.f52295b;
                if (!hc1Var7.G0 && !hc1Var7.E0) {
                    hc1Var7.g();
                    return;
                }
                return;
        }
    }
}
