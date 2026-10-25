package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f43469a;
    public final org.telegram.ui.ActionBar.k3 f43470b;

    public sd(org.telegram.ui.ActionBar.k3 k3Var, int i10) {
        this.f43469a = i10;
        this.f43470b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43469a) {
            case 0:
                this.f43470b.dismiss();
                return;
            default:
                this.f43470b.dismiss();
                return;
        }
    }
}
