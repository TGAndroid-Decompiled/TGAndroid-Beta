package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class v40 extends Paint {
    public final g60 f42683a;

    public v40(g60 g60Var) {
        this.f42683a = g60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        g60 g60Var = this.f42683a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
