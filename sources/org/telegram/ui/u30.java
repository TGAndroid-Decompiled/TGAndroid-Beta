package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class u30 extends Paint {
    public final b50 f42005a;

    public u30(b50 b50Var) {
        this.f42005a = b50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        ViewGroup viewGroup = this.f42005a.f21586b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
