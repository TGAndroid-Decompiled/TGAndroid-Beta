package rg;

import android.content.Context;
import android.widget.Scroller;
public final class u0 extends Scroller {
    public final v0 f46315a;

    public u0(v0 v0Var, Context context) {
        super(context);
        this.f46315a = v0Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f46315a.f46325x0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}
