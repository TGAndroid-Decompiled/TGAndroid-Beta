package org.telegram.ui;

import android.view.View;
public final class vr0 implements View.OnClickListener {
    public final int f50759a;
    public final org.telegram.ui.Components.l60 f50760b;

    public vr0(org.telegram.ui.Components.l60 l60Var, int i7) {
        this.f50759a = i7;
        this.f50760b = l60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50759a) {
            case 0:
                org.telegram.ui.Components.cc.e();
                this.f50760b.s();
                return;
            default:
                org.telegram.ui.Components.cc.e();
                this.f50760b.s();
                return;
        }
    }
}
