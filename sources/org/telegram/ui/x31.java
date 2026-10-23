package org.telegram.ui;

import android.view.View;
public final class x31 implements View.OnClickListener {
    public final int f43486a;
    public final b41 f43487b;

    public x31(b41 b41Var, int i10) {
        this.f43486a = i10;
        this.f43487b = b41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43486a) {
            case 0:
                b41 b41Var = this.f43487b;
                if (b41Var.Y == null) {
                    b41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f43487b.dismiss();
                return;
        }
    }
}
