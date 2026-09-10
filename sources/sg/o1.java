package sg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class o1 extends s4.n0 {
    public final p1 f41965a;

    public o1(p1 p1Var) {
        this.f41965a = p1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        p1 p1Var = this.f41965a;
        if (R == p1Var.f41973g0.size()) {
            rect.bottom = p1Var.f41982q0;
        }
    }
}
