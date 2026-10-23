package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xy0 extends org.telegram.ui.Components.t90 {
    public final ProfileActivity P0;

    public xy0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.D3();
    }

    @Override
    public final void setTextColor(int i10) {
        int o12;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34000r;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[2];
        if (n5Var != null) {
            n5Var.setTextColor(i10);
            n5VarArr[3].setTextColor(i10);
        }
        r01 r01Var = profileActivity.f33940h6;
        if (r01Var != null && r01Var.f40961c != (o12 = org.telegram.ui.ActionBar.k6.o1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            r01Var.f40961c = o12;
            r01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.b4();
        profileActivity.getClass();
        profileActivity.f34000r[2].setTranslationX(f7);
        profileActivity.f34000r[3].setTranslationX(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationX(f7 - profileActivity.b4());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34000r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        n5VarArr[2].setTranslationY(f7);
        n5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
