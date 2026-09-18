package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class r0 extends s4.s0 {
    public final int f42704a;
    public final x0 f42705b;

    public r0(x0 x0Var, int i10) {
        this.f42704a = i10;
        this.f42705b = x0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f42704a) {
            case 0:
                x0 x0Var = this.f42705b;
                viewGroup = ((f3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.y();
                return;
            default:
                x0 x0Var2 = this.f42705b;
                viewGroup2 = ((f3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.y();
                return;
        }
    }
}
