package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.ht0 {
    public final int f52264a;
    public final FrameLayout f52265b;

    public z5(int i7, FrameLayout frameLayout) {
        this.f52264a = i7;
        this.f52265b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f52264a) {
            case 0:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) recyclerView;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, this.f52265b);
                return;
            default:
                org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) recyclerView;
                ih.d.a(pj0Var2, canvas, rectF, pj0Var2, this.f52265b);
                return;
        }
    }
}
