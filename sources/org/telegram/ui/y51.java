package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class y51 implements Runnable {
    public final int f52203a;
    public final l71 f52204b;

    public y51(l71 l71Var, int i3) {
        this.f52203a = i3;
        this.f52204b = l71Var;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f52203a;
        float f10 = 0.0f;
        l71 l71Var = this.f52204b;
        switch (i10) {
            case 0:
                l71Var.f47146b0 = false;
                int i11 = l71Var.Y;
                int i12 = l71Var.Z;
                org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
                int i13 = l71Var.f47180n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        g6Var.f27527c = i11;
                        org.telegram.ui.ActionBar.k6.t1(false, false);
                    } else if (i12 == 1) {
                        g6Var.d = i11;
                        org.telegram.ui.ActionBar.k6.t1(true, true);
                        l71Var.f47202w0.g1();
                        l71Var.X.setHasChanges(l71Var.Y0(l71Var.f47180n));
                        l71Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        g6Var.f27532j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        if (i11 == 0 && E0 != 0) {
                            g6Var.f27533k = 4294967296L;
                        } else {
                            g6Var.f27533k = i11;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        if (i11 == 0 && E02 != 0) {
                            g6Var.f27534l = 4294967296L;
                        } else {
                            g6Var.f27534l = i11;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        if (i11 == 0 && E03 != 0) {
                            g6Var.f27535m = 4294967296L;
                        } else {
                            g6Var.f27535m = i11;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, false);
                    l71Var.X.setHasChanges(l71Var.Y0(l71Var.f47180n));
                    l71Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        g6Var.f27528e = i11;
                    } else if (i12 == 1) {
                        g6Var.f27529f = i11;
                    } else if (i12 == 2) {
                        int i14 = g6Var.f27530g;
                        g6Var.f27530g = i11;
                        if (i14 != 0 && i11 == 0) {
                            l71Var.f47205x0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            l71Var.f47205x0.i(0);
                            l71Var.j1();
                        }
                    } else {
                        g6Var.h = i11;
                    }
                    int i15 = l71Var.Z;
                    if (i15 >= 0) {
                        l71Var.M0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    l71Var.f47202w0.g1();
                    l71Var.X.setHasChanges(l71Var.Y0(l71Var.f47180n));
                    l71Var.r1(true);
                }
                int size = l71Var.f47175k0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) l71Var.f47175k0.get(i16);
                    t6Var.e(l71Var.getThemedColor(t6Var.f28659e), false, false);
                }
                l71Var.f47185p0.g1();
                l71Var.f47202w0.g1();
                gi.n5 n5Var = l71Var.f47150c0;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                l71Var.Z = -1;
                return;
            case 1:
                l71Var.presentFragment(r41.g0(l71Var.getMessagesController().M0(Long.valueOf(-l71Var.L1)), true));
                return;
            case 2:
                l71Var.f47191r1.l1(false);
                boolean a10 = l71Var.f47141a.a();
                org.telegram.ui.Components.ch0 ch0Var = l71Var.P1;
                if (a10) {
                    i3 = ch0Var.f32725e[0];
                } else {
                    i3 = 0;
                }
                ch0Var.P(i3);
                org.telegram.ui.Components.ch0 ch0Var2 = l71Var.P1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                }
                l71Var.g1(false);
                l71Var.a1();
                l71Var.n1();
                if (l71Var.f47175k0 != null) {
                    for (int i17 = 0; i17 < l71Var.f47175k0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.t6) l71Var.f47175k0.get(i17)).e(l71Var.getThemedColor(((org.telegram.ui.ActionBar.t6) l71Var.f47175k0.get(i17)).f28659e), false, false);
                    }
                }
                if (l71Var.O1) {
                    d71 d71Var = l71Var.f47191r1;
                    if (d71Var != null && d71Var.a()) {
                        l71Var.T1.setVisibility(0);
                        l71Var.T1.a(l71Var.f47186p1);
                    } else {
                        l71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = l71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        l71Var.R1.cancel();
                    }
                    float f11 = l71Var.f47188q1;
                    if (l71Var.f47191r1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    l71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new xy0(l71Var, 9));
                    l71Var.R1.addListener(new q61(l71Var, 5));
                    l71Var.R1.setDuration(250L);
                    l71Var.R1.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    l71Var.R1.start();
                    return;
                }
                return;
            default:
                if (l71Var.getParentActivity() != null && l71Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.az.f21612a;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    int i19 = org.telegram.messenger.az.S + 1;
                    org.telegram.messenger.az.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(7, l71Var.getParentActivity(), null, true);
                    u20Var.setAlpha(0.0f);
                    u20Var.setVisibility(4);
                    u20Var.setShowingDuration(4000L);
                    l71Var.m0.addView(u20Var, b8.mf.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (l71Var.f47191r1.a()) {
                        u20Var.setText(org.telegram.messenger.bd.M0(2131746886, null));
                    } else {
                        u20Var.setText(org.telegram.messenger.bd.M0(2131746885, null));
                    }
                    u20Var.b();
                    u20Var.c(l71Var.Q1);
                    u20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
