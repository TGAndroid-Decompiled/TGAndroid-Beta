package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41130a;
    public final org.telegram.ui.ActionBar.f3 f41131b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41130a = i10;
        this.f41131b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41130a) {
            case 0:
                this.f41131b.dismiss();
                return;
            default:
                this.f41131b.dismiss();
                return;
        }
    }
}
