package org.telegram.ui;

import android.view.View;
public final class u71 implements View.OnClickListener {
    public final d81 f37883a;

    public u71(d81 d81Var) {
        this.f37883a = d81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.aj0 aj0Var = this.f37883a.d;
        if (!aj0Var.b() && aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().M(40);
            aj0Var.d();
        }
    }
}
