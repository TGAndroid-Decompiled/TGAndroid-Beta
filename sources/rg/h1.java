package rg;

import android.content.Context;
import android.view.ViewGroup;
public final class h1 extends s4.g0 {
    public final Context f45787c;
    public final j1 d;

    public h1(j1 j1Var, Context context) {
        this.d = j1Var;
        this.f45787c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        float f7;
        i1 i1Var = (i1) b1Var.f46342a;
        ViewGroup.LayoutParams layoutParams = i1Var.getLayoutParams();
        j1 j1Var = this.d;
        layoutParams.height = ((j1Var.getHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom()) / 2;
        qg.u0 u0Var = j1Var.f45835b3;
        if (u0Var != null) {
            i1Var.f45797a = u0Var.b(i10);
            i1Var.invalidate();
            if (j1Var.f45834a3 == i10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i1Var.f45798b = f7;
            i1Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new i1(this.d, this.f45787c));
    }
}
