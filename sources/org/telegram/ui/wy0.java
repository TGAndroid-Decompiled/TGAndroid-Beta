package org.telegram.ui;

import android.content.Context;
public final class wy0 extends org.telegram.ui.Components.oi0 {
    public final ProfileActivity f43457s1;

    public wy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ly0 ly0Var, vy0 vy0Var, org.telegram.ui.Components.ji0 ji0Var, org.telegram.ui.Components.fi0 fi0Var) {
        super(context, j10, kVar, ly0Var, vy0Var, ji0Var, fi0Var);
        this.f43457s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f43457s1;
        profileActivity.p5 = f7;
        profileActivity.D3();
    }
}
