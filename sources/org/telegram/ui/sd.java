package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f40446a;
    public final org.telegram.ui.ActionBar.f3 f40447b;

    public sd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40446a = i10;
        this.f40447b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40446a) {
            case 0:
                this.f40447b.dismiss();
                return;
            default:
                this.f40447b.dismiss();
                return;
        }
    }
}
