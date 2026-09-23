package org.telegram.ui;

import android.view.View;
public final class w41 implements View.OnClickListener {
    public final int f38530a;
    public final a51 f38531b;

    public w41(a51 a51Var, int i10) {
        this.f38530a = i10;
        this.f38531b = a51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38530a) {
            case 0:
                a51 a51Var = this.f38531b;
                if (a51Var.Y == null) {
                    a51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f38531b.dismiss();
                return;
        }
    }
}
