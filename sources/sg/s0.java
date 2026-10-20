package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class s0 extends s4.r0 {
    public final int f46431a;
    public final y0 f46432b;

    public s0(y0 y0Var, int i10) {
        this.f46431a = i10;
        this.f46432b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f46431a) {
            case 0:
                y0 y0Var = this.f46432b;
                viewGroup = ((f3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.A();
                return;
            default:
                y0 y0Var2 = this.f46432b;
                viewGroup2 = ((f3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.A();
                return;
        }
    }
}
