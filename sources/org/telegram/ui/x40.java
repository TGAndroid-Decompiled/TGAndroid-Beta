package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class x40 extends Paint {
    public final h60 f42811a;

    public x40(h60 h60Var) {
        this.f42811a = h60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        h60 h60Var = this.f42811a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
