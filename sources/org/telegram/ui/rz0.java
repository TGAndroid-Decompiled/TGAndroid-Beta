package org.telegram.ui;

import android.content.Context;
public final class rz0 extends org.telegram.ui.Components.vi0 {
    public final ProfileActivity f41773s1;

    public rz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, gz0 gz0Var, qz0 qz0Var, org.telegram.ui.Components.qi0 qi0Var, org.telegram.ui.Components.mi0 mi0Var) {
        super(context, j3, kVar, gz0Var, qz0Var, qi0Var, mi0Var);
        this.f41773s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f41773s1;
        profileActivity.f34145n5 = f7;
        profileActivity.B3();
    }
}
