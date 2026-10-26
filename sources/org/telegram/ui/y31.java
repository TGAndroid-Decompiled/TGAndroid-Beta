package org.telegram.ui;

import android.view.View;
public final class y31 implements View.OnClickListener {
    public final int f45951a;
    public final c41 f45952b;

    public y31(c41 c41Var, int i10) {
        this.f45951a = i10;
        this.f45952b = c41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45951a) {
            case 0:
                c41 c41Var = this.f45952b;
                if (c41Var.Y == null) {
                    c41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f45952b.dismiss();
                return;
        }
    }
}
