package org.telegram.ui;

import android.view.View;
public final class s31 implements View.OnClickListener {
    public final a41 f41214a;

    public s31(a41 a41Var) {
        this.f41214a = a41Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.fi0 fi0Var = this.f41214a.f35562k1;
        if (!fi0Var.b() && fi0Var.getAnimatedDrawable() != null) {
            fi0Var.getAnimatedDrawable().M(40);
            fi0Var.d();
        }
    }
}
