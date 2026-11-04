package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class wu0 extends org.telegram.ui.Components.j6 {
    public final int f51609b;
    public final ProfileActivity f51610c;

    public wu0(ProfileActivity profileActivity, int i3) {
        super("headerShadow", 0);
        this.f51609b = i3;
        switch (i3) {
            case 1:
                this.f51610c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f51610c = profileActivity;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        boolean z10;
        boolean z11;
        boolean z12;
        pi.q qVar;
        int w02;
        int w03;
        org.telegram.ui.ActionBar.k kVar;
        int w04;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.f5 f5Var;
        int w05;
        int i3;
        float f11;
        int I3;
        switch (this.f51609b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f51610c.f41729b1 = f10;
                return;
            default:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
                ProfileActivity profileActivity2 = this.f51610c;
                if (profileActivity2.R5 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                profileActivity2.R5 = f10;
                qVar = ((org.telegram.ui.ActionBar.d2) profileActivity2).glassEngine;
                qVar.g();
                if (z12) {
                    profileActivity2.P3();
                }
                ProfileActivity.s1(profileActivity2);
                profileActivity2.x5();
                su0 su0Var = profileActivity2.f41838r;
                if (su0Var != null && !profileActivity2.f41826p2) {
                    Object tag = su0Var.getTag();
                    if (tag instanceof Integer) {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), profileActivity2.A0), Boolean.valueOf(profileActivity2.K0[0]));
                    } else {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, profileActivity2.A0), Boolean.TRUE);
                    }
                    su0Var.setTextColor(i0.a.f(f10, I3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, profileActivity2.A0)));
                }
                profileActivity2.z5();
                tu0 tu0Var = profileActivity2.f41866v0;
                if (tu0Var != null) {
                    tu0Var.setActionBarActionMode(f10);
                }
                ci.z0 z0Var = profileActivity2.f41874w0;
                if (z0Var != null) {
                    z0Var.setActionBarActionMode(f10);
                }
                profileActivity2.f41743d1.invalidate();
                int i10 = -1;
                if (profileActivity2.f41778h6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000ji, profileActivity2.A0);
                }
                int i11 = org.telegram.ui.ActionBar.k6.Cj;
                int w06 = org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w02, w06);
                profileActivity2.f41757f.setTextColor(S0);
                Drawable drawable = profileActivity2.f41881x;
                if (drawable != null) {
                    if (profileActivity2.f41778h6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.L != null) {
                    profileActivity2.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, profileActivity2.A0), w06));
                }
                if (profileActivity2.f41778h6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, profileActivity2.A0);
                }
                int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28275y8, profileActivity2.A0);
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity2).actionBar;
                kVar.D(org.telegram.messenger.g0.S0(f10, 1.0f, w03, w07), false);
                org.telegram.messenger.wo woVar = profileActivity2.f41778h6;
                if (woVar != null) {
                    w04 = 1090519039;
                } else if (woVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27919f8, profileActivity2.A0);
                }
                int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28292z8, profileActivity2.A0);
                kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity2).actionBar;
                kVar2.C(org.telegram.messenger.g0.S0(f10, 1.0f, w04, w08), false);
                profileActivity2.f41743d1.invalidate();
                if (profileActivity2.f41889y != null) {
                    org.telegram.messenger.wo woVar2 = profileActivity2.f41778h6;
                    if (woVar2 != null) {
                        int g7 = woVar2.g();
                        if (profileActivity2.f41778h6.o(org.telegram.ui.ActionBar.k6.I.q())) {
                            i3 = profileActivity2.f41778h6.k();
                        } else {
                            i3 = profileActivity2.f41778h6.i();
                        }
                        int f12 = i0.a.f(0.4f, g7, i3);
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f11 = -0.1f;
                        } else {
                            f11 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.k6.b(0.1f, f11, f12);
                    } else {
                        w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, profileActivity2.A0);
                    }
                    profileActivity2.f41889y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w05, org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.I != null) {
                    if (profileActivity2.f41778h6 == null) {
                        i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28093oi, profileActivity2.A0);
                    }
                    profileActivity2.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.E != null) {
                    profileActivity2.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, profileActivity2.A0), org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.s5();
                ProfileActivity profileActivity3 = profileActivity2.f41824p0.f45062n;
                if (profileActivity3.M0) {
                    f5Var = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    f5Var = profileActivity3.S0;
                } else {
                    f5Var = profileActivity3.U0;
                    if (f5Var == null) {
                        f5Var = null;
                    }
                }
                if (f5Var != null) {
                    if (profileActivity2.N0 || profileActivity2.O0 || profileActivity2.M0) {
                        profileActivity2.z4(0, profileActivity2.L3(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f51609b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f51610c.f41729b1);
            default:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(this.f51610c.R5);
        }
    }
}
