package org.telegram.ui;

import android.view.View;
public final class s41 implements View.OnClickListener {
    public final int f41016a;
    public final w41 f41017b;

    public s41(w41 w41Var, int i10) {
        this.f41016a = i10;
        this.f41017b = w41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41016a) {
            case 0:
                w41 w41Var = this.f41017b;
                if (w41Var.V == null) {
                    w41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f41017b.dismiss();
                return;
        }
    }
}
