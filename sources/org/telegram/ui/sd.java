package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f40463a;
    public final org.telegram.ui.ActionBar.f3 f40464b;

    public sd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40463a = i10;
        this.f40464b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40463a) {
            case 0:
                this.f40464b.dismiss();
                return;
            default:
                this.f40464b.dismiss();
                return;
        }
    }
}
