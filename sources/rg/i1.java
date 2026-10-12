package rg;

import android.content.Context;
import android.view.ViewGroup;
public final class i1 extends s4.g0 {
    public final Context f44284c;
    public final k1 d;

    public i1(k1 k1Var, Context context) {
        this.d = k1Var;
        this.f44284c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        float f7;
        j1 j1Var = (j1) b1Var.f44838a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        qg.s0 s0Var = k1Var.Y2;
        if (s0Var != null) {
            j1Var.f44315a = s0Var.b(i10);
            j1Var.invalidate();
            if (k1Var.X2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j1Var.f44316b = f7;
            j1Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new j1(this.d, this.f44284c));
    }
}
