package org.telegram.ui;

import android.view.View;
public final class z31 implements View.OnClickListener {
    public final int f45017a;
    public final d41 f45018b;

    public z31(d41 d41Var, int i9) {
        this.f45017a = i9;
        this.f45018b = d41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45017a) {
            case 0:
                d41 d41Var = this.f45018b;
                if (d41Var.U == null) {
                    d41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f45018b.dismiss();
                return;
        }
    }
}
