package ug;

import android.content.Context;
import android.widget.Scroller;
public final class u0 extends Scroller {
    public final v0 f58343a;

    public u0(v0 v0Var, Context context) {
        super(context);
        this.f58343a = v0Var;
    }

    @Override
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f58343a.f58348y0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i7, i10, i11, i12, i14 * i13);
    }
}
