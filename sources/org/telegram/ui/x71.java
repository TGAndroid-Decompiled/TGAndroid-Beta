package org.telegram.ui;

import android.view.View;
public final class x71 implements View.OnClickListener {
    public final g81 f39389a;

    public x71(g81 g81Var) {
        this.f39389a = g81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.f39389a.d;
        if (!nj0Var.b() && nj0Var.getAnimatedDrawable() != null) {
            nj0Var.getAnimatedDrawable().M(40);
            nj0Var.d();
        }
    }
}
