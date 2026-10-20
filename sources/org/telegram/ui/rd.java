package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41126a;
    public final org.telegram.ui.ActionBar.f3 f41127b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41126a = i10;
        this.f41127b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41126a) {
            case 0:
                this.f41127b.dismiss();
                return;
            default:
                this.f41127b.dismiss();
                return;
        }
    }
}
