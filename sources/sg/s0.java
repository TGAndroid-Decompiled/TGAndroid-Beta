package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e3;
public final class s0 extends s4.r0 {
    public final int f45357a;
    public final y0 f45358b;

    public s0(y0 y0Var, int i10) {
        this.f45357a = i10;
        this.f45358b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f45357a) {
            case 0:
                y0 y0Var = this.f45358b;
                viewGroup = ((e3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.A();
                return;
            default:
                y0 y0Var2 = this.f45358b;
                viewGroup2 = ((e3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.A();
                return;
        }
    }
}
