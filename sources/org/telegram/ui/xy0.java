package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class xy0 extends org.telegram.ui.Components.l6 {

    public final ProfileActivity f44645b;

    public xy0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f44645b = profileActivity;
    }

    @Override
    public final void c(Object obj, float f10) {
        int iV0;
        org.telegram.ui.ActionBar.v0 v0Var;
        int iV1;
        ProfileActivity profileActivity = this.f44645b;
        profileActivity.A5 = f10;
        Drawable[] drawableArr = profileActivity.A;
        Drawable[] drawableArr2 = profileActivity.E;
        Drawable[] drawableArr3 = profileActivity.f36086y;
        oy0 oy0Var = profileActivity.f36034q0;
        if (oy0Var != null) {
            oy0Var.setActionBarActionMode(f10);
        }
        hh.v0 v0Var2 = profileActivity.f36041r0;
        if (v0Var2 != null) {
            v0Var2.setActionBarActionMode(f10);
        }
        profileActivity.Z0.invalidate();
        int iV2 = profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vh, profileActivity.f36067v0);
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        int iV3 = org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0);
        int offsetColor = AndroidUtilities.getOffsetColor(iV2, iV3, f10, 1.0f);
        profileActivity.f35958f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f36079x;
        if (drawable != null) {
            if (profileActivity.M5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            profileActivity.H.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23127h8, profileActivity.f36067v0), iV3, f10, 1.0f));
        }
        ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.D(AndroidUtilities.getOffsetColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23425y8, profileActivity.f36067v0), f10, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.M5;
        if (peerColor != null) {
            iV0 = 1090519039;
        } else {
            iV0 = peerColor != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, profileActivity.f36067v0);
        }
        ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.C(AndroidUtilities.getOffsetColor(iV0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23443z8, profileActivity.f36067v0), f10, 1.0f), false);
        profileActivity.Z0.invalidate();
        profileActivity.P0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0));
        profileActivity.M0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0));
        profileActivity.N0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0));
        profileActivity.O0.setIconColor(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, profileActivity.f36067v0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36067v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.M5;
            if (peerColor2 != null) {
                iV1 = org.telegram.ui.ActionBar.g6.b(0.1f, org.telegram.ui.ActionBar.g6.I.q() ? -0.1f : -0.08f, i0.b.d(0.4f, peerColor2.getColor2(), profileActivity.M5.hasColor6(org.telegram.ui.ActionBar.g6.I.q()) ? profileActivity.M5.getColor5() : profileActivity.M5.getColor3()));
            } else {
                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36067v0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(iV1, org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.f36067v0), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.M5 == null ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.f36067v0) : -1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36067v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, profileActivity.f36067v0), org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f35994k0.f44979n;
        if (profileActivity2.H0) {
            v0Var = profileActivity2.M0;
        } else if (profileActivity2.J0) {
            v0Var = profileActivity2.O0;
        } else {
            v0Var = profileActivity2.Q0;
            if (v0Var == null) {
                v0Var = null;
            }
        }
        if (v0Var != null) {
            if (profileActivity.I0 || profileActivity.J0 || profileActivity.H0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(this.f44645b.A5);
    }
}
