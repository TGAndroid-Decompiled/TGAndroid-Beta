package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41128a;
    public final org.telegram.ui.ActionBar.f3 f41129b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41128a = i10;
        this.f41129b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41128a) {
            case 0:
                this.f41129b.dismiss();
                return;
            default:
                this.f41129b.dismiss();
                return;
        }
    }
}
