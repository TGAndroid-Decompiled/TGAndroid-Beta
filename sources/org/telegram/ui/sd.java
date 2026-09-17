package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f37465a;
    public final org.telegram.ui.ActionBar.g3 f37466b;

    public sd(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f37465a = i10;
        this.f37466b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37465a) {
            case 0:
                this.f37466b.dismiss();
                return;
            default:
                this.f37466b.dismiss();
                return;
        }
    }
}
