package org.telegram.ui;

import android.content.Context;
public final class ww0 extends org.telegram.ui.ActionBar.i5 {
    public final ProfileActivity f43378s0;

    public ww0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f43378s0 = profileActivity;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        super.v(i10, f7, f10, fVar);
        ProfileActivity.r1(this.f43378s0);
    }
}
