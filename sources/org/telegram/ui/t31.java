package org.telegram.ui;

import android.view.View;
public final class t31 implements View.OnClickListener {
    public final int f41592a;
    public final x31 f41593b;

    public t31(x31 x31Var, int i10) {
        this.f41592a = i10;
        this.f41593b = x31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41592a) {
            case 0:
                x31 x31Var = this.f41593b;
                if (x31Var.Y == null) {
                    x31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f41593b.dismiss();
                return;
        }
    }
}
