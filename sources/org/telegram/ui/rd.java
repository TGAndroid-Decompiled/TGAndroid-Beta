package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41129a;
    public final org.telegram.ui.ActionBar.f3 f41130b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41129a = i10;
        this.f41130b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41129a) {
            case 0:
                this.f41130b.dismiss();
                return;
            default:
                this.f41130b.dismiss();
                return;
        }
    }
}
