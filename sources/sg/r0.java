package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;
public final class r0 extends s4.r0 {
    public final int f46841a;
    public final y0 f46842b;

    public r0(y0 y0Var, int i10) {
        this.f46841a = i10;
        this.f46842b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f46841a) {
            case 0:
                y0 y0Var = this.f46842b;
                viewGroup = ((h3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                return;
            default:
                y0 y0Var2 = this.f46842b;
                viewGroup2 = ((h3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                return;
        }
    }
}
