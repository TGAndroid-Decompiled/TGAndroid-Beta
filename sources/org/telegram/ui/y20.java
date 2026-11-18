package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class y20 extends Paint {
    public final f40 f53970a;

    public y20(f40 f40Var) {
        this.f53970a = f40Var;
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        ViewGroup viewGroup = this.f53970a.f30190b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
