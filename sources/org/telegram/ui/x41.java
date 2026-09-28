package org.telegram.ui;

import android.view.View;
public final class x41 implements View.OnClickListener {
    public final int f39827a;
    public final b51 f39828b;

    public x41(b51 b51Var, int i10) {
        this.f39827a = i10;
        this.f39828b = b51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39827a) {
            case 0:
                b51 b51Var = this.f39828b;
                if (b51Var.Y == null) {
                    b51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f39828b.dismiss();
                return;
        }
    }
}
