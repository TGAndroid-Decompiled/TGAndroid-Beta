package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f40458a;
    public final org.telegram.ui.ActionBar.f3 f40459b;

    public sd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40458a = i10;
        this.f40459b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40458a) {
            case 0:
                this.f40459b.dismiss();
                return;
            default:
                this.f40459b.dismiss();
                return;
        }
    }
}
