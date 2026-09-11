package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class t0 extends s4.s0 {
    public final int f46280a;
    public final a1 f46281b;

    public t0(a1 a1Var, int i10) {
        this.f46280a = i10;
        this.f46281b = a1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f46280a) {
            case 0:
                a1 a1Var = this.f46281b;
                viewGroup = ((f3) a1Var).containerView;
                viewGroup.invalidate();
                a1Var.y();
                return;
            default:
                a1 a1Var2 = this.f46281b;
                viewGroup2 = ((f3) a1Var2).containerView;
                viewGroup2.invalidate();
                a1Var2.y();
                return;
        }
    }
}
