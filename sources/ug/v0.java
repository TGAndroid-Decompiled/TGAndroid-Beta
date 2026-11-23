package ug;

import android.content.Context;
import android.widget.Scroller;
public final class v0 extends Scroller {
    public final w0 f58969a;

    public v0(w0 w0Var, Context context) {
        super(context);
        this.f58969a = w0Var;
    }

    @Override
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f58969a.f58973y0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i7, i10, i11, i12, i14 * i13);
    }
}
