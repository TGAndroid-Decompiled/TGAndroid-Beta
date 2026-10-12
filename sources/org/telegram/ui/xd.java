package org.telegram.ui;

import android.view.View;
public final class xd implements View.OnClickListener {
    public final int f41834a;
    public final org.telegram.ui.ActionBar.e3 f41835b;

    public xd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f41834a = i10;
        this.f41835b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41834a) {
            case 0:
                this.f41835b.dismiss();
                return;
            default:
                this.f41835b.dismiss();
                return;
        }
    }
}
