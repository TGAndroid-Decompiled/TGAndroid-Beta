package yf;

import android.content.Context;
import android.view.ViewGroup;
public final class g1 extends f2.r0 {
    public final Context f49823c;
    public final i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.f49823c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        float f10;
        h1 h1Var = (h1) q1Var.f5501a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        xf.s0 s0Var = i1Var.W2;
        if (s0Var != null) {
            h1Var.f49828a = s0Var.b(i9);
            h1Var.invalidate();
            if (i1Var.V2 == i9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h1Var.f49829b = f10;
            h1Var.invalidate();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new h1(this.d, this.f49823c));
    }
}
