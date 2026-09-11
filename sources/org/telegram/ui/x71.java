package org.telegram.ui;

import android.view.View;
public final class x71 implements View.OnClickListener {
    public final g81 f42612a;

    public x71(g81 g81Var) {
        this.f42612a = g81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.f42612a.d;
        if (!aj0Var.b() && aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().K(40);
            aj0Var.d();
        }
    }
}
