package org.telegram.ui;

import android.view.View;
public final class t31 implements View.OnClickListener {
    public final int f41589a;
    public final x31 f41590b;

    public t31(x31 x31Var, int i10) {
        this.f41589a = i10;
        this.f41590b = x31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41589a) {
            case 0:
                x31 x31Var = this.f41590b;
                if (x31Var.Y == null) {
                    x31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f41590b.dismiss();
                return;
        }
    }
}
