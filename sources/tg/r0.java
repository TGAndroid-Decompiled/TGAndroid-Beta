package tg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.k3;
public final class r0 extends s4.u0 {
    public final int f49021a;
    public final y0 f49022b;

    public r0(y0 y0Var, int i10) {
        this.f49021a = i10;
        this.f49022b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f49021a) {
            case 0:
                y0 y0Var = this.f49022b;
                viewGroup = ((k3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                return;
            default:
                y0 y0Var2 = this.f49022b;
                viewGroup2 = ((k3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                return;
        }
    }
}
