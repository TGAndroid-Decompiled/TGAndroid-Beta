package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class t30 extends Paint {
    public final a50 f41530a;

    public t30(a50 a50Var) {
        this.f41530a = a50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        ViewGroup viewGroup = this.f41530a.f21587b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
