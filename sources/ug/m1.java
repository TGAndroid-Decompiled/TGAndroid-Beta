package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m1 extends s4.n0 {
    public final n1 f47152a;

    public m1(n1 n1Var) {
        this.f47152a = n1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        n1 n1Var = this.f47152a;
        if (R == n1Var.f47163g0.size()) {
            rect.bottom = n1Var.f47172q0;
        }
    }
}
