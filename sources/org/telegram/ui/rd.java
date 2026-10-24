package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41127a;
    public final org.telegram.ui.ActionBar.h3 f41128b;

    public rd(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f41127a = i10;
        this.f41128b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41127a) {
            case 0:
                this.f41128b.dismiss();
                return;
            default:
                this.f41128b.dismiss();
                return;
        }
    }
}
