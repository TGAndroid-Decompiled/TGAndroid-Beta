package sg;

import android.content.Context;
import android.view.ViewGroup;
public final class h1 extends s4.h0 {
    public final Context f48261c;
    public final j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.f48261c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        float f7;
        i1 i1Var = (i1) e1Var.f47773a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        rg.s0 s0Var = j1Var.f48311i3;
        if (s0Var != null) {
            i1Var.f48271a = s0Var.b(i10);
            i1Var.invalidate();
            if (j1Var.f48310h3 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i1Var.f48272b = f7;
            i1Var.invalidate();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new i1(this.d, this.f48261c));
    }
}
