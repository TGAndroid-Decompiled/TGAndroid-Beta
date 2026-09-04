package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f40145a;
    public final org.telegram.ui.ActionBar.f3 f40146b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40145a = i10;
        this.f40146b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40145a) {
            case 0:
                this.f40146b.dismiss();
                return;
            default:
                this.f40146b.dismiss();
                return;
        }
    }
}
