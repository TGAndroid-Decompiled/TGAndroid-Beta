package org.telegram.ui;

import android.view.View;
public final class vd implements View.OnClickListener {
    public final int f42762a;
    public final org.telegram.ui.ActionBar.e3 f42763b;

    public vd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f42762a = i10;
        this.f42763b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42762a) {
            case 0:
                this.f42763b.dismiss();
                return;
            default:
                this.f42763b.dismiss();
                return;
        }
    }
}
