package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class wc1 extends org.telegram.ui.Cells.m3 {
    public final int E;
    public final UserInfoActivity F;

    public wc1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, str, false, false, -1, p6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.g0(true);
                return;
            case 1:
                this.F.g0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                return;
        }
    }

    public wc1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, true, false, i10, p6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
