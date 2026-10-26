package vg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l1 extends s4.n0 {
    public final n1 f50199a;

    public l1(n1 n1Var) {
        this.f50199a = n1Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        super.d(rect, view, recyclerView, b1Var);
        int R = RecyclerView.R(view);
        n1 n1Var = this.f50199a;
        if (R == n1Var.f50215g0.size()) {
            rect.bottom = n1Var.f50224q0;
        }
    }
}
