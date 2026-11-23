package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.st0 {
    public final int f54401a;
    public final FrameLayout f54402b;

    public z5(int i7, FrameLayout frameLayout) {
        this.f54401a = i7;
        this.f54402b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f54401a) {
            case 0:
                org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.f54402b);
                return;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.f54402b);
                return;
        }
    }
}
