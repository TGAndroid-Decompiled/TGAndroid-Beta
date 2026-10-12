package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e3;
public final class s0 extends s4.t0 {
    public final int f47657a;
    public final y0 f47658b;

    public s0(y0 y0Var, int i10) {
        this.f47657a = i10;
        this.f47658b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f47657a) {
            case 0:
                y0 y0Var = this.f47658b;
                viewGroup = ((e3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.A();
                return;
            default:
                y0 y0Var2 = this.f47658b;
                viewGroup2 = ((e3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.A();
                return;
        }
    }
}
