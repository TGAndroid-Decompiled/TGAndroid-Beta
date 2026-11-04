package org.telegram.ui;

import android.content.Context;
public final class ru0 extends org.telegram.ui.Components.vf0 {
    public final ProfileActivity f49291t1;

    public ru0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hu0 hu0Var, qu0 qu0Var, org.telegram.ui.Components.rf0 rf0Var, org.telegram.ui.Components.nf0 nf0Var) {
        super(context, j10, kVar, hu0Var, qu0Var, rf0Var, nf0Var);
        this.f49291t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f49291t1;
        profileActivity.f41822o5 = f10;
        profileActivity.Q3();
    }
}
