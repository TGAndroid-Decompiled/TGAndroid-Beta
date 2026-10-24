package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class wy0 extends org.telegram.ui.Components.r90 {
    public final ProfileActivity P0;

    public wy0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34002r;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[2];
        if (n5Var != null) {
            n5Var.setTextColor(i10);
            n5VarArr[3].setTextColor(i10);
        }
        q01 q01Var = profileActivity.f33942h6;
        if (q01Var != null && q01Var.f40683c != (o12 = org.telegram.ui.ActionBar.k6.o1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            q01Var.f40683c = o12;
            q01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.b4();
        profileActivity.getClass();
        profileActivity.f34002r[2].setTranslationX(f7);
        profileActivity.f34002r[3].setTranslationX(f7);
        org.telegram.ui.Components.gx0 gx0Var = profileActivity.T;
        if (gx0Var != null) {
            gx0Var.setTranslationX(f7 - profileActivity.b4());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34002r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        n5VarArr[2].setTranslationY(f7);
        n5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.gx0 gx0Var = profileActivity.T;
        if (gx0Var != null) {
            gx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
