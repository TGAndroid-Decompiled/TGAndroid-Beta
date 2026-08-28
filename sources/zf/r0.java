package zf;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class r0 extends f2.d1 {
    public final int f50679a;
    public final x0 f50680b;

    public r0(x0 x0Var, int i9) {
        this.f50679a = i9;
        this.f50680b = x0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f50679a) {
            case 0:
                x0 x0Var = this.f50680b;
                viewGroup = ((f3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.y();
                return;
            default:
                x0 x0Var2 = this.f50680b;
                viewGroup2 = ((f3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.y();
                return;
        }
    }
}
