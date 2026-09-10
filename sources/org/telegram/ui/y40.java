package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class y40 extends Paint {
    public final j60 f38893a;

    public y40(j60 j60Var) {
        this.f38893a = j60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        j60 j60Var = this.f38893a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
