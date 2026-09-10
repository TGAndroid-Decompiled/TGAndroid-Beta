package qg;

import android.content.Context;
import android.widget.Scroller;
public final class w0 extends Scroller {
    public final x0 f40954a;

    public w0(x0 x0Var, Context context) {
        super(context);
        this.f40954a = x0Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f40954a.f40980x0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}
