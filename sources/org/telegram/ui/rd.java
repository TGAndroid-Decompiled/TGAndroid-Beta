package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f37143a;
    public final org.telegram.ui.ActionBar.f3 f37144b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f37143a = i10;
        this.f37144b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37143a) {
            case 0:
                this.f37144b.dismiss();
                return;
            default:
                this.f37144b.dismiss();
                return;
        }
    }
}
