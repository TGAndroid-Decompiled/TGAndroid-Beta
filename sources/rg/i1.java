package rg;

import android.content.Context;
import android.view.ViewGroup;
public final class i1 extends s4.h0 {
    public final Context f45215c;
    public final k1 d;

    public i1(k1 k1Var, Context context) {
        this.d = k1Var;
        this.f45215c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        float f7;
        j1 j1Var = (j1) c1Var.f45738a;
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        k1 k1Var = this.d;
        layoutParams.height = ((k1Var.getHeight() - k1Var.getPaddingTop()) - k1Var.getPaddingBottom()) / 2;
        qg.s0 s0Var = k1Var.f45268a3;
        if (s0Var != null) {
            j1Var.f45224a = s0Var.b(i10);
            j1Var.invalidate();
            if (k1Var.Z2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j1Var.f45225b = f7;
            j1Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new j1(this.d, this.f45215c));
    }
}
