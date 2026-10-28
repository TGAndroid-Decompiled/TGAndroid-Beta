package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f43298a;
    public final org.telegram.ui.ActionBar.k3 f43299b;

    public sd(org.telegram.ui.ActionBar.k3 k3Var, int i10) {
        this.f43298a = i10;
        this.f43299b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43298a) {
            case 0:
                this.f43299b.dismiss();
                return;
            default:
                this.f43299b.dismiss();
                return;
        }
    }
}
