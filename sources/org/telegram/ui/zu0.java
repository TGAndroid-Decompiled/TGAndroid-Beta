package org.telegram.ui;

import android.content.Context;
public final class zu0 extends org.telegram.ui.Components.sf0 {
    public final ProfileActivity f52656s1;

    public zu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, pu0 pu0Var, yu0 yu0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, kVar, pu0Var, yu0Var, of0Var, kf0Var);
        this.f52656s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f52656s1;
        profileActivity.f41760n5 = f10;
        profileActivity.Q3();
    }
}
