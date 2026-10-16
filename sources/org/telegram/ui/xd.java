package org.telegram.ui;

import android.view.View;
public final class xd implements View.OnClickListener {
    public final int f41543a;
    public final org.telegram.ui.ActionBar.e3 f41544b;

    public xd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f41543a = i10;
        this.f41544b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41543a) {
            case 0:
                this.f41544b.dismiss();
                return;
            default:
                this.f41544b.dismiss();
                return;
        }
    }
}
