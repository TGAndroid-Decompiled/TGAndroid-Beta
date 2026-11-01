package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.ku0 {
    public final int f43826a;
    public final FrameLayout f43827b;

    public z5(int i10, FrameLayout frameLayout) {
        this.f43826a = i10;
        this.f43827b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f43826a) {
            case 0:
                org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) recyclerView;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, this.f43827b);
                return;
            default:
                org.telegram.ui.Components.uk0 uk0Var2 = (org.telegram.ui.Components.uk0) recyclerView;
                yg.d.a(uk0Var2, canvas, rectF, uk0Var2, this.f43827b);
                return;
        }
    }
}
