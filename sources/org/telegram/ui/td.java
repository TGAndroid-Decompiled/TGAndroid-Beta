package org.telegram.ui;

import android.view.View;
public final class td implements View.OnClickListener {
    public final int f41648a;
    public final org.telegram.ui.ActionBar.f3 f41649b;

    public td(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41648a = i10;
        this.f41649b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41648a) {
            case 0:
                this.f41649b.dismiss();
                return;
            default:
                this.f41649b.dismiss();
                return;
        }
    }
}
