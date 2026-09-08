package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f40172a;
    public final org.telegram.ui.ActionBar.f3 f40173b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40172a = i10;
        this.f40173b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40172a) {
            case 0:
                this.f40173b.dismiss();
                return;
            default:
                this.f40173b.dismiss();
                return;
        }
    }
}
