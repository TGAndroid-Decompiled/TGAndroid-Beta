package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f38301a;
    public final org.telegram.ui.ActionBar.g3 f38302b;

    public sd(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f38301a = i10;
        this.f38302b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38301a) {
            case 0:
                this.f38302b.dismiss();
                return;
            default:
                this.f38302b.dismiss();
                return;
        }
    }
}
