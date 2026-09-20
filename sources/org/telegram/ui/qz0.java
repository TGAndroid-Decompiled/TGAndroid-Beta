package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends org.telegram.ui.Components.f90 {
    public final ProfileActivity P0;

    public qz0(ProfileActivity profileActivity, Context context) {
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
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f31639r;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[2];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[3].setTextColor(i10);
        }
        k11 k11Var = profileActivity.f31536b6;
        if (k11Var != null && k11Var.f35016c != (l1 = org.telegram.ui.ActionBar.j6.l1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, i10)))) {
            k11Var.f35016c = l1;
            k11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f31639r[2].setTranslationX(f7);
        profileActivity.f31639r[3].setTranslationX(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f31639r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        j5VarArr[2].setTranslationY(f7);
        j5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
