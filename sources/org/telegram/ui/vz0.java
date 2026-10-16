package org.telegram.ui;

import android.content.Context;
public final class vz0 extends org.telegram.ui.Components.pi0 {
    public final ProfileActivity f40808s1;

    public vz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, kz0 kz0Var, uz0 uz0Var, org.telegram.ui.Components.ki0 ki0Var, org.telegram.ui.Components.gi0 gi0Var) {
        super(context, j10, kVar, kz0Var, uz0Var, ki0Var, gi0Var);
        this.f40808s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40808s1;
        profileActivity.f32327n5 = f7;
        profileActivity.B3();
    }
}
