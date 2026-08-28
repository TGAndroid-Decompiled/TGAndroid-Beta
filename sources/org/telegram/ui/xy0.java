package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class xy0 extends org.telegram.ui.Components.l6 {
    public final ProfileActivity f44655b;

    public xy0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f44655b = profileActivity;
    }

    @Override
    public final void b(Object obj, float f10) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.k kVar;
        int v04;
        org.telegram.ui.ActionBar.k kVar2;
        int v05;
        int v06;
        int v07;
        int v08;
        org.telegram.ui.ActionBar.w0 w0Var;
        int v09;
        int color3;
        float f11;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f44655b;
        profileActivity.A5 = f10;
        Drawable[] drawableArr = profileActivity.A;
        Drawable[] drawableArr2 = profileActivity.E;
        Drawable[] drawableArr3 = profileActivity.f36083y;
        oy0 oy0Var = profileActivity.f36030q0;
        if (oy0Var != null) {
            oy0Var.setActionBarActionMode(f10);
        }
        gh.v0 v0Var = profileActivity.f36038r0;
        if (v0Var != null) {
            v0Var.setActionBarActionMode(f10);
        }
        profileActivity.Z0.invalidate();
        int i9 = -1;
        if (profileActivity.M5 != null) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vh, profileActivity.f36064v0);
        }
        int i10 = org.telegram.ui.ActionBar.f6.Oi;
        int v010 = org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0);
        int offsetColor = AndroidUtilities.getOffsetColor(v02, v010, f10, 1.0f);
        profileActivity.f35955f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f36076x;
        if (drawable != null) {
            if (profileActivity.M5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            profileActivity.H.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23075h8, profileActivity.f36064v0), v010, f10, 1.0f));
        }
        if (profileActivity.M5 != null) {
            v03 = -1;
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, profileActivity.f36064v0);
        }
        int v011 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23371y8, profileActivity.f36064v0);
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar.C(AndroidUtilities.getOffsetColor(v03, v011, f10, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.M5;
        if (peerColor != null) {
            v04 = 1090519039;
        } else if (peerColor != null) {
            v04 = 553648127;
        } else {
            v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23039f8, profileActivity.f36064v0);
        }
        int v012 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23388z8, profileActivity.f36064v0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar2.A(AndroidUtilities.getOffsetColor(v04, v012, f10, 1.0f), false);
        profileActivity.Z0.invalidate();
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.P0;
        if (profileActivity.M5 != null) {
            v05 = -1;
        } else {
            v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, profileActivity.f36064v0);
        }
        w0Var2.setIconColor(v05);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.M0;
        if (profileActivity.M5 != null) {
            v06 = -1;
        } else {
            v06 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, profileActivity.f36064v0);
        }
        w0Var3.setIconColor(v06);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.N0;
        if (profileActivity.M5 != null) {
            v07 = -1;
        } else {
            v07 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, profileActivity.f36064v0);
        }
        w0Var4.setIconColor(v07);
        org.telegram.ui.ActionBar.w0 w0Var5 = profileActivity.O0;
        if (profileActivity.M5 != null) {
            v08 = -1;
        } else {
            v08 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, profileActivity.f36064v0);
        }
        w0Var5.setIconColor(v08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, profileActivity.f36064v0), org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.M5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.M5.hasColor6(org.telegram.ui.ActionBar.f6.I.q())) {
                    color3 = profileActivity.M5.getColor5();
                } else {
                    color3 = profileActivity.M5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.1f;
                } else {
                    f11 = -0.08f;
                }
                v09 = org.telegram.ui.ActionBar.f6.b(0.1f, f11, d);
            } else {
                v09 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, profileActivity.f36064v0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v09, org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, profileActivity.f36064v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.M5 == null) {
                i9 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, profileActivity.f36064v0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i9, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, profileActivity.f36064v0), org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, profileActivity.f36064v0), org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f35991k0.f44986n;
        if (profileActivity2.H0) {
            w0Var = profileActivity2.M0;
        } else if (profileActivity2.J0) {
            w0Var = profileActivity2.O0;
        } else {
            w0Var = profileActivity2.Q0;
            if (w0Var == null) {
                w0Var = null;
            }
        }
        if (w0Var != null) {
            if (profileActivity.I0 || profileActivity.J0 || profileActivity.H0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f44655b.A5);
    }
}
