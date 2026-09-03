package org.telegram.ui;

import android.view.View;
public final class ud implements View.OnClickListener {
    public final int f38775a;
    public final org.telegram.ui.ActionBar.g3 f38776b;

    public ud(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f38775a = i10;
        this.f38776b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38775a) {
            case 0:
                this.f38776b.dismiss();
                return;
            default:
                this.f38776b.dismiss();
                return;
        }
    }
}
