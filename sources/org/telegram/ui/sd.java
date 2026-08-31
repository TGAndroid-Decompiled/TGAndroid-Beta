package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f41230a;
    public final org.telegram.ui.ActionBar.h3 f41231b;

    public sd(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f41230a = i10;
        this.f41231b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41230a) {
            case 0:
                this.f41231b.dismiss();
                return;
            default:
                this.f41231b.dismiss();
                return;
        }
    }
}
