package org.telegram.ui;

import android.view.View;
public final class qz0 implements View.OnClickListener {
    public final int f51404a;
    public final uz0 f51405b;

    public qz0(uz0 uz0Var, int i7) {
        this.f51404a = i7;
        this.f51405b = uz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51404a) {
            case 0:
                uz0 uz0Var = this.f51405b;
                if (uz0Var.Z == null) {
                    uz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51405b.dismiss();
                return;
        }
    }
}
