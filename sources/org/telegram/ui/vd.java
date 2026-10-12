package org.telegram.ui;

import android.view.View;
public final class vd implements View.OnClickListener {
    public final int f42760a;
    public final org.telegram.ui.ActionBar.e3 f42761b;

    public vd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f42760a = i10;
        this.f42761b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42760a) {
            case 0:
                this.f42761b.dismiss();
                return;
            default:
                this.f42761b.dismiss();
                return;
        }
    }
}
