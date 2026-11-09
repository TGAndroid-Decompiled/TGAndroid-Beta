package org.telegram.ui;

import android.view.View;
public final class qz0 implements View.OnClickListener {
    public final int f49227a;
    public final uz0 f49228b;

    public qz0(uz0 uz0Var, int i7) {
        this.f49227a = i7;
        this.f49228b = uz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49227a) {
            case 0:
                uz0 uz0Var = this.f49228b;
                if (uz0Var.Y == null) {
                    uz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f49228b.dismiss();
                return;
        }
    }
}
