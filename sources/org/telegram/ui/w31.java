package org.telegram.ui;

import android.view.View;
public final class w31 implements View.OnClickListener {
    public final int f42895a;
    public final a41 f42896b;

    public w31(a41 a41Var, int i10) {
        this.f42895a = i10;
        this.f42896b = a41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42895a) {
            case 0:
                a41 a41Var = this.f42896b;
                if (a41Var.Y == null) {
                    a41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f42896b.dismiss();
                return;
        }
    }
}
