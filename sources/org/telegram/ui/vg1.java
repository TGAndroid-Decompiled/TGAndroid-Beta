package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class vg1 extends org.telegram.ui.Cells.i3 {
    public final int f42230x;
    public final UserInfoActivity f42231y;

    public vg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, str, false, false, -1, g6Var);
        this.f42230x = i10;
        this.f42231y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f42230x) {
            case 0:
                this.f42231y.b0(true);
                return;
            case 1:
                this.f42231y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f42231y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public vg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i10, g6Var);
        this.f42230x = 2;
        this.f42231y = userInfoActivity;
    }
}
