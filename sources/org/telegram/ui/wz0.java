package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class wz0 extends org.telegram.ui.Components.y90 {
    public final ProfileActivity P0;

    public wz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override
    public final void setTextColor(int i10) {
        int m12;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32348r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        q11 q11Var = profileActivity.f32244b6;
        if (q11Var != null && q11Var.f39047c != (m12 = org.telegram.ui.ActionBar.g6.m1(1.4f, org.telegram.ui.ActionBar.g6.b(-0.02f, 0.15f, i10)))) {
            q11Var.f39047c = m12;
            q11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f32348r[2].setTranslationX(f7);
        profileActivity.f32348r[3].setTranslationX(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32348r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f7);
        h5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
