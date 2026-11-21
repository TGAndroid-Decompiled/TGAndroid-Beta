package org.telegram.ui;

import android.view.View;
public final class qz0 implements View.OnClickListener {
    public final int f51400a;
    public final uz0 f51401b;

    public qz0(uz0 uz0Var, int i7) {
        this.f51400a = i7;
        this.f51401b = uz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51400a) {
            case 0:
                uz0 uz0Var = this.f51401b;
                if (uz0Var.Z == null) {
                    uz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51401b.dismiss();
                return;
        }
    }
}
