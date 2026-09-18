package org.telegram.ui;

import android.view.View;
public final class u71 implements View.OnClickListener {
    public final d81 f37905a;

    public u71(d81 d81Var) {
        this.f37905a = d81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.f37905a.d;
        if (!lj0Var.b() && lj0Var.getAnimatedDrawable() != null) {
            lj0Var.getAnimatedDrawable().M(40);
            lj0Var.d();
        }
    }
}
