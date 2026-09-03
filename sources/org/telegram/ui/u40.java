package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class u40 extends Paint {
    public final e60 f38694a;

    public u40(e60 e60Var) {
        this.f38694a = e60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        e60 e60Var = this.f38694a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
