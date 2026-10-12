package org.telegram.ui;

import android.content.Context;
public final class wz0 extends org.telegram.ui.Components.pi0 {
    public final ProfileActivity f41699s1;

    public wz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, lz0 lz0Var, vz0 vz0Var, org.telegram.ui.Components.ki0 ki0Var, org.telegram.ui.Components.gi0 gi0Var) {
        super(context, j10, kVar, lz0Var, vz0Var, ki0Var, gi0Var);
        this.f41699s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f41699s1;
        profileActivity.f32625n5 = f7;
        profileActivity.B3();
    }
}
