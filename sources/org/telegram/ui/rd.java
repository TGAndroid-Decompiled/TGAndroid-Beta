package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41435a;
    public final org.telegram.ui.ActionBar.f3 f41436b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41435a = i10;
        this.f41436b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41435a) {
            case 0:
                this.f41436b.dismiss();
                return;
            default:
                this.f41436b.dismiss();
                return;
        }
    }
}
