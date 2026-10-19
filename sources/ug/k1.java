package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class k1 extends s4.m0 {
    public final m1 f47695a;

    public k1(m1 m1Var) {
        this.f47695a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        super.a(rect, view, recyclerView, y0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        m1 m1Var = this.f47695a;
        if (R == m1Var.f47711g0.size()) {
            rect.bottom = m1Var.f47720q0;
        }
    }
}
