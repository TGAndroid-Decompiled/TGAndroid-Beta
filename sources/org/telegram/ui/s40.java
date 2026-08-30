package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class s40 extends Paint {
    public final c60 f38193a;

    public s40(c60 c60Var) {
        this.f38193a = c60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        c60 c60Var = this.f38193a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
