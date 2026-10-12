package org.telegram.ui;

import android.content.Context;
public final class rz0 extends org.telegram.ui.Components.wi0 {
    public final ProfileActivity f41773s1;

    public rz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, gz0 gz0Var, qz0 qz0Var, org.telegram.ui.Components.ri0 ri0Var, org.telegram.ui.Components.ni0 ni0Var) {
        super(context, j3, kVar, gz0Var, qz0Var, ri0Var, ni0Var);
        this.f41773s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f41773s1;
        profileActivity.f34147n5 = f7;
        profileActivity.B3();
    }
}
