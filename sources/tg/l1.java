package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l1 extends s4.o0 {
    public final m1 f48452a;

    public l1(m1 m1Var) {
        this.f48452a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        super.a(rect, view, recyclerView, a1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        m1 m1Var = this.f48452a;
        if (R == m1Var.f48462g0.size()) {
            rect.bottom = m1Var.f48471q0;
        }
    }
}
