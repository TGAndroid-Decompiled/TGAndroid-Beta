package sg;

import android.content.Context;
import android.view.ViewGroup;
public final class i1 extends s4.h0 {
    public final Context f48237c;
    public final k1 d;

    public i1(k1 k1Var, Context context) {
        this.d = k1Var;
        this.f48237c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        float f7;
        j1 j1Var = (j1) e1Var.f47738a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        rg.s0 s0Var = k1Var.f48285i3;
        if (s0Var != null) {
            j1Var.f48268a = s0Var.b(i10);
            j1Var.invalidate();
            if (k1Var.f48284h3 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j1Var.f48269b = f7;
            j1Var.invalidate();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new j1(this.d, this.f48237c));
    }
}
