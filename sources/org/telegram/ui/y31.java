package org.telegram.ui;

import android.view.View;
public final class y31 implements View.OnClickListener {
    public final int f45948a;
    public final c41 f45949b;

    public y31(c41 c41Var, int i10) {
        this.f45948a = i10;
        this.f45949b = c41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45948a) {
            case 0:
                c41 c41Var = this.f45949b;
                if (c41Var.Y == null) {
                    c41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f45949b.dismiss();
                return;
        }
    }
}
