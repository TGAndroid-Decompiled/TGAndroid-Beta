package qg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;
public final class u0 extends s4.s0 {
    public final int f40926a;
    public final a1 f40927b;

    public u0(a1 a1Var, int i10) {
        this.f40926a = i10;
        this.f40927b = a1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f40926a) {
            case 0:
                a1 a1Var = this.f40927b;
                viewGroup = ((h3) a1Var).containerView;
                viewGroup.invalidate();
                a1Var.y();
                return;
            default:
                a1 a1Var2 = this.f40927b;
                viewGroup2 = ((h3) a1Var2).containerView;
                viewGroup2.invalidate();
                a1Var2.y();
                return;
        }
    }
}
