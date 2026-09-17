package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m1 extends s4.n0 {
    public final n1 f43192a;

    public m1(n1 n1Var) {
        this.f43192a = n1Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        n1 n1Var = this.f43192a;
        if (S == n1Var.f43203g0.size()) {
            rect.bottom = n1Var.f43212q0;
        }
    }
}
