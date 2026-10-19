package org.telegram.ui;

import android.view.View;
public final class t31 implements View.OnClickListener {
    public final int f41583a;
    public final x31 f41584b;

    public t31(x31 x31Var, int i10) {
        this.f41583a = i10;
        this.f41584b = x31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41583a) {
            case 0:
                x31 x31Var = this.f41584b;
                if (x31Var.Y == null) {
                    x31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f41584b.dismiss();
                return;
        }
    }
}
