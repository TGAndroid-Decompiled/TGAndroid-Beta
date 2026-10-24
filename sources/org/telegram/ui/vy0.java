package org.telegram.ui;

import android.content.Context;
public final class vy0 extends org.telegram.ui.Components.ni0 {
    public final ProfileActivity f42845s1;

    public vy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ky0 ky0Var, uy0 uy0Var, org.telegram.ui.Components.ii0 ii0Var, org.telegram.ui.Components.ei0 ei0Var) {
        super(context, j10, kVar, ky0Var, uy0Var, ii0Var, ei0Var);
        this.f42845s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f42845s1;
        profileActivity.p5 = f7;
        profileActivity.D3();
    }
}
