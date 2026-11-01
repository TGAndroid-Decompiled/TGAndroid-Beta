package org.telegram.ui;

import android.content.Context;
public final class vw0 extends org.telegram.ui.ActionBar.i5 {
    public final ProfileActivity f42616s0;

    public vw0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f42616s0 = profileActivity;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        super.v(i10, f7, f10, fVar);
        ProfileActivity.s1(this.f42616s0);
    }
}
