package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f41120a;
    public final org.telegram.ui.ActionBar.f3 f41121b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f41120a = i10;
        this.f41121b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41120a) {
            case 0:
                this.f41121b.dismiss();
                return;
            default:
                this.f41121b.dismiss();
                return;
        }
    }
}
