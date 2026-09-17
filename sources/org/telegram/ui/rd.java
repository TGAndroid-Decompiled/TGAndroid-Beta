package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f40146a;
    public final org.telegram.ui.ActionBar.f3 f40147b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40146a = i10;
        this.f40147b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40146a) {
            case 0:
                this.f40147b.dismiss();
                return;
            default:
                this.f40147b.dismiss();
                return;
        }
    }
}
