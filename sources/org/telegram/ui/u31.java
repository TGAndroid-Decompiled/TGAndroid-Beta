package org.telegram.ui;

import android.view.View;
public final class u31 implements View.OnClickListener {
    public final c41 f42006a;

    public u31(c41 c41Var) {
        this.f42006a = c41Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ei0 ei0Var = this.f42006a.f36386k1;
        if (!ei0Var.b() && ei0Var.getAnimatedDrawable() != null) {
            ei0Var.getAnimatedDrawable().M(40);
            ei0Var.d();
        }
    }
}
