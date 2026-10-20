package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class xa1 implements Runnable {
    public final int f43178a;
    public final kc1 f43179b;

    public xa1(kc1 kc1Var, int i10) {
        this.f43178a = i10;
        this.f43179b = kc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f43178a;
        float f7 = 0.0f;
        kc1 kc1Var = this.f43179b;
        switch (i11) {
            case 0:
                kc1Var.Z = false;
                int i12 = kc1Var.W;
                int i13 = kc1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = kc1Var.f38565s;
                int i14 = kc1Var.f38553n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f20834c = i12;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        kc1Var.f38570u0.f1();
                        kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.f38553n));
                        kc1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f20838j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        if (i12 == 0 && C0 != 0) {
                            f6Var.f20839k = 4294967296L;
                        } else {
                            f6Var.f20839k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            f6Var.f20840l = 4294967296L;
                        } else {
                            f6Var.f20840l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            f6Var.f20841m = 4294967296L;
                        } else {
                            f6Var.f20841m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, false);
                    kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.f38553n));
                    kc1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.e = i12;
                    } else if (i13 == 1) {
                        f6Var.f20835f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f20836g;
                        f6Var.f20836g = i12;
                        if (i15 != 0 && i12 == 0) {
                            kc1Var.f38572v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            kc1Var.f38572v0.o(0);
                            kc1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = kc1Var.X;
                    if (i16 >= 0) {
                        kc1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    kc1Var.f38570u0.f1();
                    kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.f38553n));
                    kc1Var.m1(true);
                }
                int size = kc1Var.f38543i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) kc1Var.f38543i0.get(i17);
                    j6Var.e(kc1Var.getThemedColor(j6Var.f21459f), false, false);
                }
                kc1Var.f38554n0.f1();
                kc1Var.f38570u0.f1();
                ei.g6 g6Var = kc1Var.f38517a0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                kc1Var.X = -1;
                return;
            case 1:
                kc1Var.presentFragment(p91.d0(kc1Var.getMessagesController().getChat(Long.valueOf(-kc1Var.J1)), true));
                return;
            case 2:
                kc1Var.f38559p1.c1(false);
                boolean a2 = kc1Var.f38516a.a();
                org.telegram.ui.Components.vj0 vj0Var = kc1Var.N1;
                if (a2) {
                    i10 = vj0Var.e[0];
                } else {
                    i10 = 0;
                }
                vj0Var.P(i10);
                org.telegram.ui.Components.vj0 vj0Var2 = kc1Var.N1;
                if (vj0Var2 != null) {
                    vj0Var2.start();
                }
                kc1Var.b1(false);
                kc1Var.V0();
                kc1Var.i1();
                if (kc1Var.f38543i0 != null) {
                    for (int i18 = 0; i18 < kc1Var.f38543i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.j6) kc1Var.f38543i0.get(i18)).e(kc1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) kc1Var.f38543i0.get(i18)).f21459f), false, false);
                    }
                }
                if (kc1Var.M1) {
                    bc1 bc1Var = kc1Var.f38559p1;
                    if (bc1Var != null && bc1Var.a()) {
                        kc1Var.R1.setVisibility(0);
                        kc1Var.R1.a(kc1Var.f38555n1);
                    } else {
                        kc1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = kc1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        kc1Var.P1.cancel();
                    }
                    float f10 = kc1Var.f38557o1;
                    if (kc1Var.f38559p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    kc1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new c11(kc1Var, 11));
                    kc1Var.P1.addListener(new ob1(kc1Var, 5));
                    kc1Var.P1.setDuration(250L);
                    kc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                    kc1Var.P1.start();
                    return;
                }
                return;
            default:
                if (kc1Var.getParentActivity() != null && kc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, kc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    kc1Var.f38549k0.addView(r40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (kc1Var.f38559p1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(kc1Var.O1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
