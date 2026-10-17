package org.telegram.ui;

import android.view.View;
public final class td implements View.OnClickListener {
    public final int f41657a;
    public final org.telegram.ui.ActionBar.f3 f41658b;

    public td(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41657a = i10;
        this.f41658b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41657a) {
            case 0:
                this.f41658b.dismiss();
                return;
            default:
                this.f41658b.dismiss();
                return;
        }
    }
}
