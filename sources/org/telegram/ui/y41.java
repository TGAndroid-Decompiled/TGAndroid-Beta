package org.telegram.ui;

import android.view.View;
public final class y41 implements View.OnClickListener {
    public final int f43118a;
    public final c51 f43119b;

    public y41(c51 c51Var, int i10) {
        this.f43118a = i10;
        this.f43119b = c51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43118a) {
            case 0:
                c51 c51Var = this.f43119b;
                if (c51Var.Y == null) {
                    c51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f43119b.dismiss();
                return;
        }
    }
}
