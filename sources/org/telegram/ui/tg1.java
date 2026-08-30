package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class tg1 extends org.telegram.ui.Cells.i3 {
    public final int f38663x;
    public final UserInfoActivity f38664y;

    public tg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, str, false, false, -1, f6Var);
        this.f38663x = i10;
        this.f38664y = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f38663x) {
            case 0:
                this.f38664y.b0(true);
                return;
            case 1:
                this.f38664y.b0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.f38664y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                return;
        }
    }

    public tg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i10, f6Var);
        this.f38663x = 2;
        this.f38664y = userInfoActivity;
    }
}
