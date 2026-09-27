package org.telegram.ui;

import android.view.View;
public final class td implements View.OnClickListener {
    public final int f37757a;
    public final org.telegram.ui.ActionBar.g3 f37758b;

    public td(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f37757a = i10;
        this.f37758b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37757a) {
            case 0:
                this.f37758b.dismiss();
                return;
            default:
                this.f37758b.dismiss();
                return;
        }
    }
}
