package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class x40 extends Paint {
    public final j60 f42618a;

    public x40(j60 j60Var) {
        this.f42618a = j60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        j60 j60Var = this.f42618a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
