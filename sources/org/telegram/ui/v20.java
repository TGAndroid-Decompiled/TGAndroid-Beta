package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class v20 extends Paint {
    public final c40 f52107a;

    public v20(c40 c40Var) {
        this.f52107a = c40Var;
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        ViewGroup viewGroup = this.f52107a.f29682b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
