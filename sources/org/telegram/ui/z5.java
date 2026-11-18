package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.pt0 {
    public final int f54431a;
    public final FrameLayout f54432b;

    public z5(int i7, FrameLayout frameLayout) {
        this.f54431a = i7;
        this.f54432b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f54431a) {
            case 0:
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this.f54432b);
                return;
            default:
                org.telegram.ui.Components.ck0 ck0Var2 = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, this.f54432b);
                return;
        }
    }
}
