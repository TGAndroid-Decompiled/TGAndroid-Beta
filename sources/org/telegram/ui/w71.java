package org.telegram.ui;

import android.view.View;
public final class w71 implements View.OnClickListener {
    public final f81 f38590a;

    public w71(f81 f81Var) {
        this.f38590a = f81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.bj0 bj0Var = this.f38590a.d;
        if (!bj0Var.b() && bj0Var.getAnimatedDrawable() != null) {
            bj0Var.getAnimatedDrawable().M(40);
            bj0Var.d();
        }
    }
}
