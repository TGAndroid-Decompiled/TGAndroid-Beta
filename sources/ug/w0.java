package ug;

import android.content.Context;
import android.widget.Scroller;
public final class w0 extends Scroller {
    public final x0 f58930a;

    public w0(x0 x0Var, Context context) {
        super(context);
        this.f58930a = x0Var;
    }

    @Override
    public final void startScroll(int i7, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f58930a.f58933y0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i7, i10, i11, i12, i14 * i13);
    }
}
