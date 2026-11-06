package org.telegram.ui;

import android.view.View;
public final class tr0 implements View.OnClickListener {
    public final int f50135a;
    public final org.telegram.ui.Components.k60 f50136b;

    public tr0(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.f50135a = i7;
        this.f50136b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50135a) {
            case 0:
                org.telegram.ui.Components.cc.e();
                this.f50136b.s();
                return;
            default:
                org.telegram.ui.Components.cc.e();
                this.f50136b.s();
                return;
        }
    }
}
