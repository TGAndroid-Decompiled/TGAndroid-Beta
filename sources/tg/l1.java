package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l1 extends s4.n0 {
    public final m1 f43468a;

    public l1(m1 m1Var) {
        this.f43468a = m1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        m1 m1Var = this.f43468a;
        if (S == m1Var.f43478g0.size()) {
            rect.bottom = m1Var.f43487q0;
        }
    }
}
