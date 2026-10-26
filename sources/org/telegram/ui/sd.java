package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f43472a;
    public final org.telegram.ui.ActionBar.k3 f43473b;

    public sd(org.telegram.ui.ActionBar.k3 k3Var, int i10) {
        this.f43472a = i10;
        this.f43473b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43472a) {
            case 0:
                this.f43473b.dismiss();
                return;
            default:
                this.f43473b.dismiss();
                return;
        }
    }
}
