package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class z5 implements org.telegram.ui.Components.ju0 {
    public final int f44018a;
    public final FrameLayout f44019b;

    public z5(int i10, FrameLayout frameLayout) {
        this.f44018a = i10;
        this.f44019b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f44018a) {
            case 0:
                org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) recyclerView;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, this.f44019b);
                return;
            default:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) recyclerView;
                yg.d.a(tk0Var2, canvas, rectF, tk0Var2, this.f44019b);
                return;
        }
    }
}
