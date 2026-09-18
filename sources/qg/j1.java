package qg;

import android.content.Context;
import android.view.ViewGroup;
public final class j1 extends s4.h0 {
    public final Context f41448c;
    public final l1 d;

    public j1(l1 l1Var, Context context) {
        this.d = l1Var;
        this.f41448c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        float f7;
        k1 k1Var = (k1) c1Var.f42702a;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        l1 l1Var = this.d;
        layoutParams.height = ((l1Var.getHeight() - l1Var.getPaddingTop()) - l1Var.getPaddingBottom()) / 2;
        pg.s0 s0Var = l1Var.f41475a3;
        if (s0Var != null) {
            k1Var.f41455a = s0Var.b(i10);
            k1Var.invalidate();
            if (l1Var.Z2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k1Var.f41456b = f7;
            k1Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new k1(this.d, this.f41448c));
    }
}
