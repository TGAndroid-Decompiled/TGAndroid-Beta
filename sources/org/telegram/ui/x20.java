package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class x20 extends Paint {
    public final e40 f53826a;

    public x20(e40 e40Var) {
        this.f53826a = e40Var;
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        ViewGroup viewGroup = this.f53826a.f30226b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
