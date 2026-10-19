package org.telegram.ui;

import android.view.View;
public final class t31 implements View.OnClickListener {
    public final int f41584a;
    public final x31 f41585b;

    public t31(x31 x31Var, int i10) {
        this.f41584a = i10;
        this.f41585b = x31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41584a) {
            case 0:
                x31 x31Var = this.f41585b;
                if (x31Var.Y == null) {
                    x31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f41585b.dismiss();
                return;
        }
    }
}
