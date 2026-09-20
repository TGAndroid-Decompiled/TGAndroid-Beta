package org.telegram.ui;

import android.view.View;
public final class x71 implements View.OnClickListener {
    public final g81 f39365a;

    public x71(g81 g81Var) {
        this.f39365a = g81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.f39365a.d;
        if (!kj0Var.b() && kj0Var.getAnimatedDrawable() != null) {
            kj0Var.getAnimatedDrawable().M(40);
            kj0Var.d();
        }
    }
}
