package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class xy0 extends org.telegram.ui.Components.q6 {
    public final ProfileActivity f44676b;

    public xy0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f44676b = profileActivity;
    }

    @Override
    public final void b(Object obj, float f9) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.l lVar;
        int v04;
        org.telegram.ui.ActionBar.l lVar2;
        int v05;
        int v06;
        int v07;
        int v08;
        org.telegram.ui.ActionBar.w0 w0Var;
        int v09;
        int color3;
        float f10;
        org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) obj;
        ProfileActivity profileActivity = this.f44676b;
        profileActivity.A5 = f9;
        Drawable[] drawableArr = profileActivity.A;
        Drawable[] drawableArr2 = profileActivity.E;
        Drawable[] drawableArr3 = profileActivity.f36148y;
        oy0 oy0Var = profileActivity.f36097q0;
        if (oy0Var != null) {
            oy0Var.setActionBarActionMode(f9);
        }
        jh.u0 u0Var = profileActivity.f36104r0;
        if (u0Var != null) {
            u0Var.setActionBarActionMode(f9);
        }
        profileActivity.Z0.invalidate();
        int i10 = -1;
        if (profileActivity.M5 != null) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, profileActivity.f36129v0);
        }
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        int v010 = org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0);
        int offsetColor = AndroidUtilities.getOffsetColor(v02, v010, f9, 1.0f);
        profileActivity.f36020f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f36142x;
        if (drawable != null) {
            if (profileActivity.M5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            profileActivity.H.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23136h8, profileActivity.f36129v0), v010, f9, 1.0f));
        }
        if (profileActivity.M5 != null) {
            v03 = -1;
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
        }
        int v011 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y8, profileActivity.f36129v0);
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        lVar.C(AndroidUtilities.getOffsetColor(v03, v011, f9, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.M5;
        if (peerColor != null) {
            v04 = 1090519039;
        } else if (peerColor != null) {
            v04 = 553648127;
        } else {
            v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23101f8, profileActivity.f36129v0);
        }
        int v012 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23452z8, profileActivity.f36129v0);
        lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        lVar2.B(AndroidUtilities.getOffsetColor(v04, v012, f9, 1.0f), false);
        profileActivity.Z0.invalidate();
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.P0;
        if (profileActivity.M5 != null) {
            v05 = -1;
        } else {
            v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
        }
        w0Var2.setIconColor(v05);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.M0;
        if (profileActivity.M5 != null) {
            v06 = -1;
        } else {
            v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
        }
        w0Var3.setIconColor(v06);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.N0;
        if (profileActivity.M5 != null) {
            v07 = -1;
        } else {
            v07 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
        }
        w0Var4.setIconColor(v07);
        org.telegram.ui.ActionBar.w0 w0Var5 = profileActivity.O0;
        if (profileActivity.M5 != null) {
            v08 = -1;
        } else {
            v08 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, profileActivity.f36129v0);
        }
        w0Var5.setIconColor(v08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36129v0), org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.M5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.M5.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
                    color3 = profileActivity.M5.getColor5();
                } else {
                    color3 = profileActivity.M5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                v09 = org.telegram.ui.ActionBar.g6.b(0.1f, f10, d);
            } else {
                v09 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36129v0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v09, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.f36129v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.M5 == null) {
                i10 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.f36129v0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36129v0), org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36129v0), org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0), f9, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f36056k0.f44997n;
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
        org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
        return Float.valueOf(this.f44676b.A5);
    }
}
