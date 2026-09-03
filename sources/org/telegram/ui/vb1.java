package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class vb1 implements Runnable {
    public final int f42081a;
    public final jd1 f42082b;

    public vb1(jd1 jd1Var, int i10) {
        this.f42081a = i10;
        this.f42082b = jd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f42081a;
        float f10 = 0.0f;
        jd1 jd1Var = this.f42082b;
        switch (i11) {
            case 0:
                jd1Var.W = false;
                int i12 = jd1Var.T;
                int i13 = jd1Var.U;
                org.telegram.ui.ActionBar.i6 i6Var = jd1Var.f38008s;
                int i14 = jd1Var.f37996n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        i6Var.f21471c = i12;
                        org.telegram.ui.ActionBar.k6.n1(false, false);
                    } else if (i13 == 1) {
                        i6Var.d = i12;
                        org.telegram.ui.ActionBar.k6.n1(true, true);
                        jd1Var.f38006r0.e1();
                        jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f37996n));
                        jd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        i6Var.f21476j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                        if (i12 == 0 && B0 != 0) {
                            i6Var.f21477k = 4294967296L;
                        } else {
                            i6Var.f21477k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            i6Var.f21478l = 4294967296L;
                        } else {
                            i6Var.f21478l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            i6Var.f21479m = 4294967296L;
                        } else {
                            i6Var.f21479m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, false);
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f37996n));
                    jd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        i6Var.f21472e = i12;
                    } else if (i13 == 1) {
                        i6Var.f21473f = i12;
                    } else if (i13 == 2) {
                        int i15 = i6Var.f21474g;
                        i6Var.f21474g = i12;
                        if (i15 != 0 && i12 == 0) {
                            jd1Var.f38009s0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            jd1Var.f38009s0.o(0);
                            jd1Var.e1();
                        }
                    } else {
                        i6Var.h = i12;
                    }
                    int i16 = jd1Var.U;
                    if (i16 >= 0) {
                        jd1Var.H0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, true);
                    jd1Var.f38006r0.e1();
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f37996n));
                    jd1Var.m1(true);
                }
                int size = jd1Var.f37980f0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) jd1Var.f37980f0.get(i17);
                    m6Var.d(jd1Var.getThemedColor(m6Var.f22145f), false, false);
                }
                jd1Var.f37992k0.e1();
                jd1Var.f38006r0.e1();
                fg.i0 i0Var = jd1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                jd1Var.U = -1;
                return;
            case 1:
                jd1Var.presentFragment(na1.d0(jd1Var.getMessagesController().getChat(Long.valueOf(-jd1Var.G1)), true));
                return;
            case 2:
                jd1Var.f37995m1.l1(false);
                boolean a2 = jd1Var.f37961a.a();
                org.telegram.ui.Components.hj0 hj0Var = jd1Var.K1;
                if (a2) {
                    i10 = hj0Var.f27524e[0];
                } else {
                    i10 = 0;
                }
                hj0Var.N(i10);
                org.telegram.ui.Components.hj0 hj0Var2 = jd1Var.K1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                }
                jd1Var.b1(false);
                jd1Var.V0();
                jd1Var.i1();
                if (jd1Var.f37980f0 != null) {
                    for (int i18 = 0; i18 < jd1Var.f37980f0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.m6) jd1Var.f37980f0.get(i18)).d(jd1Var.getThemedColor(((org.telegram.ui.ActionBar.m6) jd1Var.f37980f0.get(i18)).f22145f), false, false);
                    }
                }
                if (jd1Var.J1) {
                    ad1 ad1Var = jd1Var.f37995m1;
                    if (ad1Var != null && ad1Var.a()) {
                        jd1Var.O1.setVisibility(0);
                        jd1Var.O1.a(jd1Var.f37993k1);
                    } else {
                        jd1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = jd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jd1Var.M1.cancel();
                    }
                    float f11 = jd1Var.l1;
                    if (jd1Var.f37995m1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    jd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new n11(jd1Var, 13));
                    jd1Var.M1.addListener(new nc1(jd1Var, 5));
                    jd1Var.M1.setDuration(250L);
                    jd1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                    jd1Var.M1.start();
                    return;
                }
                return;
            default:
                if (jd1Var.getParentActivity() != null && jd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, jd1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    jd1Var.f37986h0.addView(m40Var, k7.c6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (jd1Var.f37995m1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(jd1Var.L1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
