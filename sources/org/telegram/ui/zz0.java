package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class zz0 extends org.telegram.ui.Components.t6 {
    public final ProfileActivity f45167b;

    public zz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f45167b = profileActivity;
    }

    @Override
    public final void c(Object obj, float f7) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.k kVar;
        int w04;
        org.telegram.ui.ActionBar.k kVar2;
        int w05;
        int w06;
        int w07;
        int w08;
        org.telegram.ui.ActionBar.u0 u0Var;
        int w09;
        int color3;
        float f10;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f45167b;
        profileActivity.E5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.f34442y;
        qz0 qz0Var = profileActivity.f34414u0;
        if (qz0Var != null) {
            qz0Var.setActionBarActionMode(f7);
        }
        yh.e0 e0Var = profileActivity.f34421v0;
        if (e0Var != null) {
            e0Var.setActionBarActionMode(f7);
        }
        profileActivity.f34297d1.invalidate();
        int i10 = -1;
        if (profileActivity.Q5 != null) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21164vh, profileActivity.f34448z0);
        }
        int i11 = org.telegram.ui.ActionBar.h6.Oi;
        int w010 = org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34448z0);
        int offsetColor = AndroidUtilities.getOffsetColor(w02, w010, f7, 1.0f);
        profileActivity.f34311f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f34435x;
        if (drawable != null) {
            if (profileActivity.Q5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20896h8, profileActivity.f34448z0), w010, f7, 1.0f));
        }
        if (profileActivity.Q5 != null) {
            w03 = -1;
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, profileActivity.f34448z0);
        }
        int w011 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21209y8, profileActivity.f34448z0);
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar.D(AndroidUtilities.getOffsetColor(w03, w011, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.Q5;
        if (peerColor != null) {
            w04 = 1090519039;
        } else if (peerColor != null) {
            w04 = 553648127;
        } else {
            w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20860f8, profileActivity.f34448z0);
        }
        int w012 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21227z8, profileActivity.f34448z0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar2.C(AndroidUtilities.getOffsetColor(w04, w012, f7, 1.0f), false);
        profileActivity.f34297d1.invalidate();
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.T0;
        if (profileActivity.Q5 != null) {
            w05 = -1;
        } else {
            w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, profileActivity.f34448z0);
        }
        u0Var2.setIconColor(w05);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.Q0;
        if (profileActivity.Q5 != null) {
            w06 = -1;
        } else {
            w06 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, profileActivity.f34448z0);
        }
        u0Var3.setIconColor(w06);
        org.telegram.ui.ActionBar.u0 u0Var4 = profileActivity.R0;
        if (profileActivity.Q5 != null) {
            w07 = -1;
        } else {
            w07 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, profileActivity.f34448z0);
        }
        u0Var4.setIconColor(w07);
        org.telegram.ui.ActionBar.u0 u0Var5 = profileActivity.S0;
        if (profileActivity.Q5 != null) {
            w08 = -1;
        } else {
            w08 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, profileActivity.f34448z0);
        }
        u0Var5.setIconColor(w08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, profileActivity.f34448z0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.Q5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.Q5.hasColor6(org.telegram.ui.ActionBar.h6.I.q())) {
                    color3 = profileActivity.Q5.getColor5();
                } else {
                    color3 = profileActivity.Q5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                w09 = org.telegram.ui.ActionBar.h6.b(0.1f, f10, d);
            } else {
                w09 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, profileActivity.f34448z0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(w09, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.f34448z0), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.Q5 == null) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.f34448z0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, profileActivity.f34448z0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21236zh, profileActivity.f34448z0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34448z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f34372o0.f35874n;
        if (profileActivity2.L0) {
            u0Var = profileActivity2.Q0;
        } else if (profileActivity2.N0) {
            u0Var = profileActivity2.S0;
        } else {
            u0Var = profileActivity2.U0;
            if (u0Var == null) {
                u0Var = null;
            }
        }
        if (u0Var != null) {
            if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f45167b.E5);
    }
}
