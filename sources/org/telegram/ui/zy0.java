package org.telegram.ui;

import android.content.Context;
public final class zy0 extends org.telegram.ui.Components.ni0 {
    public final ProfileActivity f46388s1;

    public zy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, py0 py0Var, yy0 yy0Var, org.telegram.ui.Components.ii0 ii0Var, org.telegram.ui.Components.ei0 ei0Var) {
        super(context, j10, kVar, py0Var, yy0Var, ii0Var, ei0Var);
        this.f46388s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f46388s1;
        profileActivity.f36087t5 = f7;
        profileActivity.J3();
    }
}
