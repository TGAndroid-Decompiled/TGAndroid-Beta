package org.telegram.ui;

import android.view.View;
public final class v31 implements View.OnClickListener {
    public final int f42110a;
    public final z31 f42111b;

    public v31(z31 z31Var, int i10) {
        this.f42110a = i10;
        this.f42111b = z31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42110a) {
            case 0:
                z31 z31Var = this.f42111b;
                if (z31Var.Y == null) {
                    z31Var.dismiss();
                    return;
                }
                return;
            default:
                this.f42111b.dismiss();
                return;
        }
    }
}
