package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class uz0 extends org.telegram.ui.Components.h90 {
    public final ProfileActivity P0;

    public uz0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[2];
        if (l5Var != null) {
            l5Var.setTextColor(i10);
            l5VarArr[3].setTextColor(i10);
        }
        q11 q11Var = profileActivity.f30364b6;
        if (q11Var != null && q11Var.f35952c != (l1 = org.telegram.ui.ActionBar.j6.l1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, i10)))) {
            q11Var.f35952c = l1;
            q11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f30467r[2].setTranslationX(f7);
        profileActivity.f30467r[3].setTranslationX(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        l5VarArr[2].setTranslationY(f7);
        l5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.tw0 tw0Var = profileActivity.T;
        if (tw0Var != null) {
            tw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
