package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class za1 implements Runnable {
    public final int f43733a;
    public final mc1 f43734b;

    public za1(mc1 mc1Var, int i10) {
        this.f43733a = i10;
        this.f43734b = mc1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f43733a;
        float f7 = 0.0f;
        mc1 mc1Var = this.f43734b;
        switch (i11) {
            case 0:
                mc1Var.Z = false;
                int i12 = mc1Var.W;
                int i13 = mc1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39171s;
                int i14 = mc1Var.f39159n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        f6Var.f20837c = i12;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i13 == 1) {
                        f6Var.d = i12;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        mc1Var.f39176u0.f1();
                        mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.f39159n));
                        mc1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        f6Var.f20841j = i12;
                    } else if (i13 == 1) {
                        int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        if (i12 == 0 && C0 != 0) {
                            f6Var.f20842k = 4294967296L;
                        } else {
                            f6Var.f20842k = i12;
                        }
                    } else if (i13 == 2) {
                        int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i12 == 0 && C02 != 0) {
                            f6Var.f20843l = 4294967296L;
                        } else {
                            f6Var.f20843l = i12;
                        }
                    } else if (i13 == 3) {
                        int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i12 == 0 && C03 != 0) {
                            f6Var.f20844m = 4294967296L;
                        } else {
                            f6Var.f20844m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, false);
                    mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.f39159n));
                    mc1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        f6Var.e = i12;
                    } else if (i13 == 1) {
                        f6Var.f20838f = i12;
                    } else if (i13 == 2) {
                        int i15 = f6Var.f20839g;
                        f6Var.f20839g = i12;
                        if (i15 != 0 && i12 == 0) {
                            mc1Var.f39178v0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            mc1Var.f39178v0.o(0);
                            mc1Var.e1();
                        }
                    } else {
                        f6Var.h = i12;
                    }
                    int i16 = mc1Var.X;
                    if (i16 >= 0) {
                        mc1Var.K0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    mc1Var.f39176u0.f1();
                    mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.f39159n));
                    mc1Var.m1(true);
                }
                int size = mc1Var.f39149i0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) mc1Var.f39149i0.get(i17);
                    j6Var.e(mc1Var.getThemedColor(j6Var.f21462f), false, false);
                }
                mc1Var.f39160n0.f1();
                mc1Var.f39176u0.f1();
                ei.g6 g6Var = mc1Var.f39123a0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                mc1Var.X = -1;
                return;
            case 1:
                mc1Var.presentFragment(r91.d0(mc1Var.getMessagesController().getChat(Long.valueOf(-mc1Var.J1)), true));
                return;
            case 2:
                mc1Var.f39165p1.c1(false);
                boolean a2 = mc1Var.f39122a.a();
                org.telegram.ui.Components.uj0 uj0Var = mc1Var.N1;
                if (a2) {
                    i10 = uj0Var.e[0];
                } else {
                    i10 = 0;
                }
                uj0Var.P(i10);
                org.telegram.ui.Components.uj0 uj0Var2 = mc1Var.N1;
                if (uj0Var2 != null) {
                    uj0Var2.start();
                }
                mc1Var.b1(false);
                mc1Var.V0();
                mc1Var.i1();
                if (mc1Var.f39149i0 != null) {
                    for (int i18 = 0; i18 < mc1Var.f39149i0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.j6) mc1Var.f39149i0.get(i18)).e(mc1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) mc1Var.f39149i0.get(i18)).f21462f), false, false);
                    }
                }
                if (mc1Var.M1) {
                    dc1 dc1Var = mc1Var.f39165p1;
                    if (dc1Var != null && dc1Var.a()) {
                        mc1Var.R1.setVisibility(0);
                        mc1Var.R1.a(mc1Var.f39161n1);
                    } else {
                        mc1Var.R1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = mc1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mc1Var.P1.cancel();
                    }
                    float f10 = mc1Var.f39163o1;
                    if (mc1Var.f39165p1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    mc1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new e11(mc1Var, 11));
                    mc1Var.P1.addListener(new qb1(mc1Var, 5));
                    mc1Var.P1.setDuration(250L);
                    mc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f25037f);
                    mc1Var.P1.start();
                    return;
                }
                return;
            default:
                if (mc1Var.getParentActivity() != null && mc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, mc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    mc1Var.f39155k0.addView(r40Var, w7.z5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (mc1Var.f39165p1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(mc1Var.O1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
