package org.telegram.ui;

import android.content.Context;
public final class sy0 extends org.telegram.ui.Components.ki0 {
    public final ProfileActivity f41546s1;

    public sy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hy0 hy0Var, ry0 ry0Var, org.telegram.ui.Components.fi0 fi0Var, org.telegram.ui.Components.bi0 bi0Var) {
        super(context, j10, kVar, hy0Var, ry0Var, fi0Var, bi0Var);
        this.f41546s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f41546s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
