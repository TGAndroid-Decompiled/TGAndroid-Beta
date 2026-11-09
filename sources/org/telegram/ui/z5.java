package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.it0 {
    public final int f52436a;
    public final FrameLayout f52437b;

    public z5(int i7, FrameLayout frameLayout) {
        this.f52436a = i7;
        this.f52437b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f52436a) {
            case 0:
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) recyclerView;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, this.f52437b);
                return;
            default:
                org.telegram.ui.Components.qj0 qj0Var2 = (org.telegram.ui.Components.qj0) recyclerView;
                ih.d.a(qj0Var2, canvas, rectF, qj0Var2, this.f52437b);
                return;
        }
    }
}
