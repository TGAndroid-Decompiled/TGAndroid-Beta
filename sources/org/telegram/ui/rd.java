package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41391a;
    public final org.telegram.ui.ActionBar.f3 f41392b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41391a = i10;
        this.f41392b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41391a) {
            case 0:
                this.f41392b.dismiss();
                return;
            default:
                this.f41392b.dismiss();
                return;
        }
    }
}
