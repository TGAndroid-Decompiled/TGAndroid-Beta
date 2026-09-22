package qg;

import android.content.Context;
import android.view.ViewGroup;
public final class h1 extends s4.h0 {
    public final Context f41689c;
    public final j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.f41689c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        float f7;
        i1 i1Var = (i1) c1Var.f42995a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        pg.u0 u0Var = j1Var.f41739a3;
        if (u0Var != null) {
            i1Var.f41697a = u0Var.b(i10);
            i1Var.invalidate();
            if (j1Var.Z2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i1Var.f41698b = f7;
            i1Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new i1(this.d, this.f41689c));
    }
}
