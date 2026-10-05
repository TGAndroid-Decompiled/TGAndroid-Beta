package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class s0 extends s4.s0 {
    public final int f46316a;
    public final y0 f46317b;

    public s0(y0 y0Var, int i10) {
        this.f46316a = i10;
        this.f46317b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f46316a) {
            case 0:
                y0 y0Var = this.f46317b;
                viewGroup = ((f3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.y();
                return;
            default:
                y0 y0Var2 = this.f46317b;
                viewGroup2 = ((f3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.y();
                return;
        }
    }
}
