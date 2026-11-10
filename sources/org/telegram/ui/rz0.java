package org.telegram.ui;

import android.view.View;
public final class rz0 implements View.OnClickListener {
    public final int f49606a;
    public final vz0 f49607b;

    public rz0(vz0 vz0Var, int i7) {
        this.f49606a = i7;
        this.f49607b = vz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49606a) {
            case 0:
                vz0 vz0Var = this.f49607b;
                if (vz0Var.Y == null) {
                    vz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f49607b.dismiss();
                return;
        }
    }
}
