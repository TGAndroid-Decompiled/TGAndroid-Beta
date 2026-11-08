package ug;

import android.content.Context;
import android.widget.Scroller;
public final class t0 extends Scroller {
    public final u0 f56816a;

    public t0(u0 u0Var, Context context) {
        super(context);
        this.f56816a = u0Var;
    }

    @Override
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f56816a.f56831x0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i7, i10, i11, i12, i14 * i13);
    }
}
