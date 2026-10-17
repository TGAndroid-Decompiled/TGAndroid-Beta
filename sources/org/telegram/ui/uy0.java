package org.telegram.ui;

import android.content.Context;
public final class uy0 extends org.telegram.ui.Components.ki0 {
    public final ProfileActivity f42070s1;

    public uy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, jy0 jy0Var, ty0 ty0Var, org.telegram.ui.Components.fi0 fi0Var, org.telegram.ui.Components.bi0 bi0Var) {
        super(context, j10, kVar, jy0Var, ty0Var, fi0Var, bi0Var);
        this.f42070s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f42070s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
