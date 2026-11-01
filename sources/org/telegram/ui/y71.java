package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class y71 implements Runnable {
    public final int f43603a;
    public final k91 f43604b;

    public y71(k91 k91Var, int i10) {
        this.f43603a = i10;
        this.f43604b = k91Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f43603a;
        float f7 = 0.0f;
        k91 k91Var = this.f43604b;
        switch (i11) {
            case 0:
                k91Var.f38713a0 = false;
                int i12 = k91Var.X;
                int i13 = k91Var.Y;
                org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
                int i14 = k91Var.f38750n;
                if (i14 == 1) {
                    if (i13 == 0) {
                        r6Var.f20733c = i12;
                        org.telegram.ui.ActionBar.t6.t1(false, false);
                    } else if (i13 == 1) {
                        r6Var.d = i12;
                        org.telegram.ui.ActionBar.t6.t1(true, true);
                        k91Var.f38769v0.g1();
                        k91Var.W.setHasChanges(k91Var.Y0(k91Var.f38750n));
                        k91Var.r1(true);
                    }
                } else if (i14 == 2) {
                    if (i13 == 0) {
                        r6Var.f20737j = i12;
                    } else if (i13 == 1) {
                        int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        if (i12 == 0 && E0 != 0) {
                            r6Var.f20738k = 4294967296L;
                        } else {
                            r6Var.f20738k = i12;
                        }
                    } else if (i13 == 2) {
                        int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        if (i12 == 0 && E02 != 0) {
                            r6Var.f20739l = 4294967296L;
                        } else {
                            r6Var.f20739l = i12;
                        }
                    } else if (i13 == 3) {
                        int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        if (i12 == 0 && E03 != 0) {
                            r6Var.f20740m = 4294967296L;
                        } else {
                            r6Var.f20740m = i12;
                        }
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, false);
                    k91Var.W.setHasChanges(k91Var.Y0(k91Var.f38750n));
                    k91Var.r1(true);
                } else if (i14 == 3) {
                    if (i13 == 0) {
                        r6Var.e = i12;
                    } else if (i13 == 1) {
                        r6Var.f20734f = i12;
                    } else if (i13 == 2) {
                        int i15 = r6Var.f20735g;
                        r6Var.f20735g = i12;
                        if (i15 != 0 && i12 == 0) {
                            k91Var.f38772w0.s(0);
                        } else if (i15 == 0 && i12 != 0) {
                            k91Var.f38772w0.i(0);
                            k91Var.j1();
                        }
                    } else {
                        r6Var.h = i12;
                    }
                    int i16 = k91Var.Y;
                    if (i16 >= 0) {
                        k91Var.L0[1].b(i16, i12);
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, true);
                    k91Var.f38769v0.g1();
                    k91Var.W.setHasChanges(k91Var.Y0(k91Var.f38750n));
                    k91Var.r1(true);
                }
                int size = k91Var.f38742j0.size();
                for (int i17 = 0; i17 < size; i17++) {
                    org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) k91Var.f38742j0.get(i17);
                    c7Var.e(k91Var.getThemedColor(c7Var.e), false, false);
                }
                k91Var.f38753o0.g1();
                k91Var.f38769v0.g1();
                kg.f0 f0Var = k91Var.f38716b0;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                k91Var.Y = -1;
                return;
            case 1:
                k91Var.presentFragment(s61.g0(k91Var.getMessagesController().L0(Long.valueOf(-k91Var.K1)), true));
                return;
            case 2:
                k91Var.f38758q1.M1(false);
                boolean a2 = k91Var.f38712a.a();
                org.telegram.ui.Components.ci0 ci0Var = k91Var.O1;
                if (a2) {
                    i10 = ci0Var.e[0];
                } else {
                    i10 = 0;
                }
                ci0Var.P(i10);
                org.telegram.ui.Components.ci0 ci0Var2 = k91Var.O1;
                if (ci0Var2 != null) {
                    ci0Var2.start();
                }
                k91Var.g1(false);
                k91Var.a1();
                k91Var.n1();
                if (k91Var.f38742j0 != null) {
                    for (int i18 = 0; i18 < k91Var.f38742j0.size(); i18++) {
                        ((org.telegram.ui.ActionBar.c7) k91Var.f38742j0.get(i18)).e(k91Var.getThemedColor(((org.telegram.ui.ActionBar.c7) k91Var.f38742j0.get(i18)).e), false, false);
                    }
                }
                if (k91Var.N1) {
                    c91 c91Var = k91Var.f38758q1;
                    if (c91Var != null && c91Var.a()) {
                        k91Var.S1.setVisibility(0);
                        k91Var.S1.a(k91Var.f38754o1);
                    } else {
                        k91Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = k91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        k91Var.Q1.cancel();
                    }
                    float f10 = k91Var.f38756p1;
                    if (k91Var.f38758q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    k91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(k91Var, 9));
                    k91Var.Q1.addListener(new p81(k91Var, 5));
                    k91Var.Q1.setDuration(250L);
                    k91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                    k91Var.Q1.start();
                    return;
                }
                return;
            default:
                if (k91Var.getParentActivity() != null && k91Var.getParentActivity() != null) {
                    int i19 = org.telegram.messenger.uz.f18500a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    int i20 = org.telegram.messenger.uz.S + 1;
                    org.telegram.messenger.uz.S = i20;
                    edit.putInt("dayNightWallpaperSwitchHint", i20);
                    edit.apply();
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, k91Var.getParentActivity(), null, true);
                    q30Var.setAlpha(0.0f);
                    q30Var.setVisibility(4);
                    q30Var.setShowingDuration(4000L);
                    k91Var.f38748l0.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (k91Var.f38758q1.a()) {
                        q30Var.setText(org.telegram.messenger.dd.L0(2131746893, null));
                    } else {
                        q30Var.setText(org.telegram.messenger.dd.L0(2131746892, null));
                    }
                    q30Var.d();
                    q30Var.f(k91Var.P1, true);
                    q30Var.setExtraTranslationY(-org.telegram.messenger.i0.L(14.0f));
                    return;
                }
                return;
        }
    }
}
