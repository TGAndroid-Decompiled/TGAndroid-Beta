package org.telegram.ui;

import android.content.Context;
public final class xy0 extends org.telegram.ui.Components.vh0 {
    public final ProfileActivity f40336p1;

    public xy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, my0 my0Var, wy0 wy0Var, org.telegram.ui.Components.qh0 qh0Var, org.telegram.ui.Components.mh0 mh0Var) {
        super(context, j10, kVar, my0Var, wy0Var, qh0Var, mh0Var);
        this.f40336p1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f40336p1;
        profileActivity.f32104k5 = f10;
        profileActivity.B3();
    }
}
