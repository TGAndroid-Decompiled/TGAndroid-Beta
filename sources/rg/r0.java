package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e3;
public final class r0 extends s4.s0 {
    public final int f42737a;
    public final x0 f42738b;

    public r0(x0 x0Var, int i10) {
        this.f42737a = i10;
        this.f42738b = x0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f42737a) {
            case 0:
                x0 x0Var = this.f42738b;
                viewGroup = ((e3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.y();
                return;
            default:
                x0 x0Var2 = this.f42738b;
                viewGroup2 = ((e3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.y();
                return;
        }
    }
}
