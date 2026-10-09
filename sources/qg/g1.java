package qg;

import android.content.Context;
import android.view.ViewGroup;
public final class g1 extends s4.i0 {
    public final Context f46254c;
    public final i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.f46254c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        float f7;
        h1 h1Var = (h1) d1Var.f47656a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        pg.u0 u0Var = i1Var.Y2;
        if (u0Var != null) {
            h1Var.f46258a = u0Var.b(i10);
            h1Var.invalidate();
            if (i1Var.X2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h1Var.f46259b = f7;
            h1Var.invalidate();
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new h1(this.d, this.f46254c));
    }
}
