package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class j1 extends s4.m0 {
    public final l1 f47712a;

    public j1(l1 l1Var) {
        this.f47712a = l1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        super.a(rect, view, recyclerView, y0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        l1 l1Var = this.f47712a;
        if (R == l1Var.f47728g0.size()) {
            rect.bottom = l1Var.f47737q0;
        }
    }
}
