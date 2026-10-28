package org.telegram.ui;

import android.view.View;
public final class t61 implements View.OnClickListener {
    public final c71 f43527a;

    public t61(c71 c71Var) {
        this.f43527a = c71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.bk0 bk0Var = this.f43527a.d;
        if (!bk0Var.b() && bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().M(40);
            bk0Var.d();
        }
    }
}
