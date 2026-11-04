package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
public final class va1 extends org.telegram.ui.Cells.k3 {
    public final int F;
    public final UserInfoActivity G;

    public va1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, str, false, false, -1, e6Var);
        this.F = i3;
        this.G = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                this.G.g0(true);
                return;
            case 1:
                this.G.g0(true);
                return;
            default:
                UserInfoActivity userInfoActivity = this.G;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                return;
        }
    }

    public va1(UserInfoActivity userInfoActivity, Context context, String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, true, false, i3, e6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
