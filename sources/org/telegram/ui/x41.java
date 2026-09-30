package org.telegram.ui;

import android.view.View;
public final class x41 implements View.OnClickListener {
    public final int f39924a;
    public final b51 f39925b;

    public x41(b51 b51Var, int i10) {
        this.f39924a = i10;
        this.f39925b = b51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39924a) {
            case 0:
                b51 b51Var = this.f39925b;
                if (b51Var.Y == null) {
                    b51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f39925b.dismiss();
                return;
        }
    }
}
