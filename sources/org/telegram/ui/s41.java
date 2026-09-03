package org.telegram.ui;

import android.view.View;
public final class s41 implements View.OnClickListener {
    public final int f38100a;
    public final w41 f38101b;

    public s41(w41 w41Var, int i10) {
        this.f38100a = i10;
        this.f38101b = w41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38100a) {
            case 0:
                w41 w41Var = this.f38101b;
                if (w41Var.V == null) {
                    w41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f38101b.dismiss();
                return;
        }
    }
}
