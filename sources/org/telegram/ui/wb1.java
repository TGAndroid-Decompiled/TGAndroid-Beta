package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class wb1 implements Runnable {
    public final int f39332a;
    public final jd1 f39333b;

    public wb1(jd1 jd1Var, int i10) {
        this.f39332a = i10;
        this.f39333b = jd1Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f39332a;
        float f10 = 0.0f;
        jd1 jd1Var = this.f39333b;
        switch (i11) {
            case 0:
                jd1Var.W = false;
                int i12 = jd1Var.T;
                int i13 = jd1Var.U;
                org.telegram.ui.ActionBar.h6 h6Var = jd1Var.f35225s;
                int i14 = jd1Var.f35213n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        h6Var.f19738c = i12;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i13 == 1) {
                        h6Var.d = i12;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        jd1Var.f35223r0.e1();
                        jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f35213n));
                        jd1Var.m1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        h6Var.f19742j = i12;
                    } else if (i13 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i12 == 0 && B0 != 0) {
                            h6Var.f19743k = 4294967296L;
                        } else {
                            h6Var.f19743k = i12;
                        }
                    } else if (i13 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i12 == 0 && B02 != 0) {
                            h6Var.f19744l = 4294967296L;
                        } else {
                            h6Var.f19744l = i12;
                        }
                    } else if (i13 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i12 == 0 && B03 != 0) {
                            h6Var.f19745m = 4294967296L;
                        } else {
                            h6Var.f19745m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f35213n));
                    jd1Var.m1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        h6Var.e = i12;
                    } else if (i13 == 1) {
                        h6Var.f19739f = i12;
                    } else if (i13 == 2) {
                        int i15 = h6Var.f19740g;
                        h6Var.f19740g = i12;
                        if (i15 != 0 && i12 == 0) {
                            jd1Var.f35226s0.u(0);
                        } else if (i15 == 0 && i12 != 0) {
                            jd1Var.f35226s0.o(0);
                            jd1Var.e1();
                        }
                    } else {
                        h6Var.h = i12;
                    }
                    int i16 = jd1Var.U;
                    if (i16 >= 0) {
                        jd1Var.H0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    jd1Var.f35223r0.e1();
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.f35213n));
                    jd1Var.m1(true);
                }
                int size = jd1Var.f35197f0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) jd1Var.f35197f0.get(i17);
                    l6Var.d(jd1Var.getThemedColor(l6Var.f20409f), false, false);
                }
                jd1Var.f35209k0.e1();
                jd1Var.f35223r0.e1();
                eg.i0 i0Var = jd1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                jd1Var.U = -1;
                return;
            case 1:
                jd1Var.presentFragment(oa1.d0(jd1Var.getMessagesController().getChat(Long.valueOf(-jd1Var.G1)), true));
                return;
            case 2:
                jd1Var.f35212m1.l1(false);
                boolean a2 = jd1Var.f35179a.a();
                org.telegram.ui.Components.gj0 gj0Var = jd1Var.K1;
                if (a2) {
                    i10 = gj0Var.e[0];
                } else {
                    i10 = 0;
                }
                gj0Var.N(i10);
                org.telegram.ui.Components.gj0 gj0Var2 = jd1Var.K1;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                }
                jd1Var.b1(false);
                jd1Var.V0();
                jd1Var.i1();
                if (jd1Var.f35197f0 != null) {
                    for (int i18 = 0; i18 < jd1Var.f35197f0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.l6) jd1Var.f35197f0.get(i18)).d(jd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) jd1Var.f35197f0.get(i18)).f20409f), false, false);
                    }
                }
                if (jd1Var.J1) {
                    ad1 ad1Var = jd1Var.f35212m1;
                    if (ad1Var != null && ad1Var.a()) {
                        jd1Var.O1.setVisibility(0);
                        jd1Var.O1.a(jd1Var.f35210k1);
                    } else {
                        jd1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = jd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jd1Var.M1.cancel();
                    }
                    float f11 = jd1Var.l1;
                    if (jd1Var.f35212m1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    jd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new o11(jd1Var, 13));
                    jd1Var.M1.addListener(new nc1(jd1Var, 5));
                    jd1Var.M1.setDuration(250L);
                    jd1Var.M1.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    jd1Var.M1.start();
                    return;
                }
                return;
            default:
                if (jd1Var.getParentActivity() != null && jd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(7, jd1Var.getParentActivity(), null, true);
                    l40Var.setAlpha(0.0f);
                    l40Var.setVisibility(4);
                    l40Var.setShowingDuration(4000L);
                    jd1Var.f35203h0.addView(l40Var, k7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (jd1Var.f35212m1.a()) {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    l40Var.d();
                    l40Var.f(jd1Var.L1, true);
                    l40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
        }
    }
}
