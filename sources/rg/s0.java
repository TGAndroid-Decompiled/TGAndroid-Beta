package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e3;
public final class s0 extends s4.t0 {
    public final int f47649a;
    public final y0 f47650b;

    public s0(y0 y0Var, int i10) {
        this.f47649a = i10;
        this.f47650b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f47649a) {
            case 0:
                y0 y0Var = this.f47650b;
                viewGroup = ((e3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.A();
                return;
            default:
                y0 y0Var2 = this.f47650b;
                viewGroup2 = ((e3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.A();
                return;
        }
    }
}
