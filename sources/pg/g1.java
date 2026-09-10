package pg;

import android.content.Context;
import android.view.ViewGroup;
public final class g1 extends s4.h0 {
    public final Context f40008c;
    public final i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.f40008c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        float f7;
        h1 h1Var = (h1) c1Var.f41610a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        og.x0 x0Var = i1Var.f40028a3;
        if (x0Var != null) {
            h1Var.f40013a = x0Var.b(i10);
            h1Var.invalidate();
            if (i1Var.Z2 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h1Var.f40014b = f7;
            h1Var.invalidate();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new h1(this.d, this.f40008c));
    }
}
