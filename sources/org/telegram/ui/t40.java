package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class t40 extends Paint {
    public final d60 f41498a;

    public t40(d60 d60Var) {
        this.f41498a = d60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        d60 d60Var = this.f41498a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
