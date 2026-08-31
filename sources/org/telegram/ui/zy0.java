package org.telegram.ui;

import android.content.Context;
public final class zy0 extends org.telegram.ui.Components.xh0 {
    public final ProfileActivity f44018p1;

    public zy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, oy0 oy0Var, yy0 yy0Var, org.telegram.ui.Components.sh0 sh0Var, org.telegram.ui.Components.oh0 oh0Var) {
        super(context, j10, kVar, oy0Var, yy0Var, sh0Var, oh0Var);
        this.f44018p1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f44018p1;
        profileActivity.f34637k5 = f10;
        profileActivity.B3();
    }
}
