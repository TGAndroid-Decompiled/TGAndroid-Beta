package org.telegram.ui;

import android.view.View;
public final class sr0 implements View.OnClickListener {
    public final int f49802a;
    public final org.telegram.ui.Components.k60 f49803b;

    public sr0(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.f49802a = i7;
        this.f49803b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49802a) {
            case 0:
                org.telegram.ui.Components.cc.e();
                this.f49803b.s();
                return;
            default:
                org.telegram.ui.Components.cc.e();
                this.f49803b.s();
                return;
        }
    }
}
