package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class yc1 extends org.telegram.ui.Cells.m3 {
    public final int E;
    public final UserInfoActivity F;

    public yc1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, str, false, false, -1, p6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.f0(true);
                return;
            case 1:
                this.F.f0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.f0(true);
                userInfoActivity.i0();
                return;
        }
    }

    public yc1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, true, false, i10, p6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
