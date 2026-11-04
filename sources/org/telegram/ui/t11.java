package org.telegram.ui;

import android.view.View;
public final class t11 implements View.OnClickListener {
    public final b21 f49670a;

    public t11(b21 b21Var) {
        this.f49670a = b21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.fh0 fh0Var = this.f49670a.f43903l1;
        if (!fh0Var.b() && fh0Var.getAnimatedDrawable() != null) {
            fh0Var.getAnimatedDrawable().M(40);
            fh0Var.d();
        }
    }
}
