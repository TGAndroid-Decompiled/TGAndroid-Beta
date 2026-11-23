package org.telegram.ui;

import android.content.Context;
public final class zu0 extends org.telegram.ui.Components.gg0 {
    public final ProfileActivity f54728t1;

    public zu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, pu0 pu0Var, yu0 yu0Var, org.telegram.ui.Components.cg0 cg0Var, org.telegram.ui.Components.yf0 yf0Var) {
        super(context, j3, kVar, pu0Var, yu0Var, cg0Var, yf0Var);
        this.f54728t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f54728t1;
        profileActivity.f43773t5 = f10;
        profileActivity.Q3();
    }
}
