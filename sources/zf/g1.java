package zf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.lk0;

public final class g1 extends f2.q0 {

    public final Context f50415c;
    public final i1 d;

    public g1(i1 i1Var, Context context) {
        this.d = i1Var;
        this.f50415c = context;
    }

    @Override
    public final int h() {
        return 14;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        h1 h1Var = (h1) o1Var.f5789a;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        i1 i1Var = this.d;
        layoutParams.height = ((i1Var.getHeight() - i1Var.getPaddingTop()) - i1Var.getPaddingBottom()) / 2;
        yf.r0 r0Var = i1Var.W2;
        if (r0Var != null) {
            h1Var.f50422a = r0Var.b(i10);
            h1Var.invalidate();
            h1Var.f50423b = i1Var.V2 == i10 ? 1.0f : 0.0f;
            h1Var.invalidate();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new h1(this.d, this.f50415c));
    }
}
