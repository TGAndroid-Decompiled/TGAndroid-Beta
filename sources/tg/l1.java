package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l1 extends s4.n0 {
    public final m1 f47036a;

    public l1(m1 m1Var) {
        this.f47036a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        m1 m1Var = this.f47036a;
        if (R == m1Var.f47047g0.size()) {
            rect.bottom = m1Var.f47056q0;
        }
    }
}
