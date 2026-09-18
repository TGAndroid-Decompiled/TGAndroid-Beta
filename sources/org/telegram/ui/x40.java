package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class x40 extends Paint {
    public final i60 f39353a;

    public x40(i60 i60Var) {
        this.f39353a = i60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        i60 i60Var = this.f39353a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
