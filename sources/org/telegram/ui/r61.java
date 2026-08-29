package org.telegram.ui;

import android.view.View;
public final class r61 implements View.OnClickListener {
    public final a71 f41983a;

    public r61(a71 a71Var) {
        this.f41983a = a71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.f41983a.d;
        if (!aj0Var.b() && aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().K(40);
            aj0Var.d();
        }
    }
}
