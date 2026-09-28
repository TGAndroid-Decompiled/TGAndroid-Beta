package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class s40 extends Paint {
    public final d60 f37591a;

    public s40(d60 d60Var) {
        this.f37591a = d60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        d60 d60Var = this.f37591a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
