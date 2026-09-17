package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f40173a;
    public final org.telegram.ui.ActionBar.f3 f40174b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40173a = i10;
        this.f40174b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40173a) {
            case 0:
                this.f40174b.dismiss();
                return;
            default:
                this.f40174b.dismiss();
                return;
        }
    }
}
