package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f37470a;
    public final org.telegram.ui.ActionBar.g3 f37471b;

    public sd(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f37470a = i10;
        this.f37471b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37470a) {
            case 0:
                this.f37471b.dismiss();
                return;
            default:
                this.f37471b.dismiss();
                return;
        }
    }
}
