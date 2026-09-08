package org.telegram.ui;

import android.content.Context;
public final class qz0 extends org.telegram.ui.Components.oh0 {
    public final ProfileActivity f40049s1;

    public qz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, gz0 gz0Var, pz0 pz0Var, org.telegram.ui.Components.jh0 jh0Var, org.telegram.ui.Components.fh0 fh0Var) {
        super(context, j3, kVar, gz0Var, pz0Var, jh0Var, fh0Var);
        this.f40049s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40049s1;
        profileActivity.f33980n5 = f7;
        profileActivity.B3();
    }
}
