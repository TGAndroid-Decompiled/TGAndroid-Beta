package org.telegram.ui;

import android.view.View;
public final class td implements View.OnClickListener {
    public final int f41683a;
    public final org.telegram.ui.ActionBar.f3 f41684b;

    public td(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41683a = i10;
        this.f41684b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41683a) {
            case 0:
                this.f41684b.dismiss();
                return;
            default:
                this.f41684b.dismiss();
                return;
        }
    }
}
