package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class r0 extends s4.t0 {
    public final int f47466a;
    public final y0 f47467b;

    public r0(y0 y0Var, int i10) {
        this.f47466a = i10;
        this.f47467b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f47466a) {
            case 0:
                y0 y0Var = this.f47467b;
                viewGroup = ((f3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                return;
            default:
                y0 y0Var2 = this.f47467b;
                viewGroup2 = ((f3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                return;
        }
    }
}
