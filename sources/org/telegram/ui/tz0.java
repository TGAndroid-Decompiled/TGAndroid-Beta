package org.telegram.ui;

import android.content.Context;
public final class tz0 extends org.telegram.ui.Components.yh0 {
    public final ProfileActivity f37064s1;

    public tz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.l lVar, jz0 jz0Var, sz0 sz0Var, org.telegram.ui.Components.th0 th0Var, org.telegram.ui.Components.ph0 ph0Var) {
        super(context, j3, lVar, jz0Var, sz0Var, th0Var, ph0Var);
        this.f37064s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f37064s1;
        profileActivity.f30446n5 = f7;
        profileActivity.B3();
    }
}
