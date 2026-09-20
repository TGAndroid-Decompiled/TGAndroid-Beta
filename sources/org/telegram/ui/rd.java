package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f37120a;
    public final org.telegram.ui.ActionBar.f3 f37121b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f37120a = i10;
        this.f37121b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37120a) {
            case 0:
                this.f37121b.dismiss();
                return;
            default:
                this.f37121b.dismiss();
                return;
        }
    }
}
