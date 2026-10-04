package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f40457a;
    public final org.telegram.ui.ActionBar.f3 f40458b;

    public sd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40457a = i10;
        this.f40458b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40457a) {
            case 0:
                this.f40458b.dismiss();
                return;
            default:
                this.f40458b.dismiss();
                return;
        }
    }
}
