package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class z40 extends Paint {
    public final k60 f40123a;

    public z40(k60 k60Var) {
        this.f40123a = k60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        k60 k60Var = this.f40123a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
