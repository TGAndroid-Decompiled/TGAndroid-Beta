package org.telegram.ui;

import android.view.View;
public final class v31 implements View.OnClickListener {
    public final int f42085a;
    public final z31 f42086b;

    public v31(z31 z31Var, int i10) {
        this.f42085a = i10;
        this.f42086b = z31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42085a) {
            case 0:
                z31 z31Var = this.f42086b;
                if (z31Var.Y == null) {
                    z31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f42086b.dismiss();
                return;
        }
    }
}
