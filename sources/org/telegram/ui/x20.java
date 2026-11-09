package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class x20 extends Paint {
    public final e40 f51530a;

    public x20(e40 e40Var) {
        this.f51530a = e40Var;
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        ViewGroup viewGroup = this.f51530a.f28624b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
