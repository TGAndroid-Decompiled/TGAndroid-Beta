package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41389a;
    public final org.telegram.ui.ActionBar.f3 f41390b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41389a = i10;
        this.f41390b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41389a) {
            case 0:
                this.f41390b.dismiss();
                return;
            default:
                this.f41390b.dismiss();
                return;
        }
    }
}
