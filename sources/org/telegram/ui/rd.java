package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41092a;
    public final org.telegram.ui.ActionBar.h3 f41093b;

    public rd(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f41092a = i10;
        this.f41093b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41092a) {
            case 0:
                this.f41093b.dismiss();
                return;
            default:
                this.f41093b.dismiss();
                return;
        }
    }
}
