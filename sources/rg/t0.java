package rg;

import android.content.Context;
import android.widget.Scroller;
public final class t0 extends Scroller {
    public final u0 f42788a;

    public t0(u0 u0Var, Context context) {
        super(context);
        this.f42788a = u0Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f42788a.f42799x0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}
