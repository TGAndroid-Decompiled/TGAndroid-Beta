package org.telegram.ui;

import android.view.View;

public final class y31 implements View.OnClickListener {

    public final int f44699a;

    public final c41 f44700b;

    public y31(c41 c41Var, int i10) {
        this.f44699a = i10;
        this.f44700b = c41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44699a) {
            case 0:
                c41 c41Var = this.f44700b;
                if (c41Var.U == null) {
                    c41Var.dismiss();
                }
                break;
            default:
                this.f44700b.dismiss();
                break;
        }
    }
}
