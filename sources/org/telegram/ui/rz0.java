package org.telegram.ui;

import android.content.Context;
public final class rz0 extends org.telegram.ui.Components.ph0 {
    public final ProfileActivity f37345s1;

    public rz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, hz0 hz0Var, qz0 qz0Var, org.telegram.ui.Components.kh0 kh0Var, org.telegram.ui.Components.gh0 gh0Var) {
        super(context, j3, kVar, hz0Var, qz0Var, kh0Var, gh0Var);
        this.f37345s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f37345s1;
        profileActivity.f31347n5 = f7;
        profileActivity.B3();
    }
}
