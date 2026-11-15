package org.telegram.ui;

import android.content.Context;
public final class yu0 extends org.telegram.ui.Components.vf0 {
    public final ProfileActivity f53599t1;

    public yu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ou0 ou0Var, xu0 xu0Var, org.telegram.ui.Components.rf0 rf0Var, org.telegram.ui.Components.nf0 nf0Var) {
        super(context, j3, kVar, ou0Var, xu0Var, rf0Var, nf0Var);
        this.f53599t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f53599t1;
        profileActivity.f43187r5 = f10;
        profileActivity.P3();
    }
}
