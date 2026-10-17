package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class r0 extends s4.r0 {
    public final int f46418a;
    public final x0 f46419b;

    public r0(x0 x0Var, int i10) {
        this.f46418a = i10;
        this.f46419b = x0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f46418a) {
            case 0:
                x0 x0Var = this.f46419b;
                viewGroup = ((f3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.A();
                return;
            default:
                x0 x0Var2 = this.f46419b;
                viewGroup2 = ((f3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.A();
                return;
        }
    }
}
