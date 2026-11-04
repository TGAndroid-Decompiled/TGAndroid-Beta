package vg;

import android.content.Context;
import android.widget.Scroller;
public final class s0 extends Scroller {
    public final t0 f56828a;

    public s0(t0 t0Var, Context context) {
        super(context);
        this.f56828a = t0Var;
    }

    @Override
    public final void startScroll(int i3, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f56828a.f56855y0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i3, i10, i11, i12, i14 * i13);
    }
}
