package org.telegram.ui;

import android.view.View;
public final class v71 implements View.OnClickListener {
    public final e81 f38389a;

    public v71(e81 e81Var) {
        this.f38389a = e81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.f38389a.d;
        if (!aj0Var.b() && aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().M(40);
            aj0Var.d();
        }
    }
}
