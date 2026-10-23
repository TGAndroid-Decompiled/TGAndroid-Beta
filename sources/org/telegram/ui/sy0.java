package org.telegram.ui;

import android.content.Context;
public final class sy0 extends org.telegram.ui.Components.li0 {
    public final ProfileActivity f41556s1;

    public sy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hy0 hy0Var, ry0 ry0Var, org.telegram.ui.Components.gi0 gi0Var, org.telegram.ui.Components.ci0 ci0Var) {
        super(context, j10, kVar, hy0Var, ry0Var, gi0Var, ci0Var);
        this.f41556s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f41556s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
