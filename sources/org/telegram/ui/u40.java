package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class u40 extends Paint {
    public final f60 f37900a;

    public u40(f60 f60Var) {
        this.f37900a = f60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        f60 f60Var = this.f37900a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
