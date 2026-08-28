package zf;

import android.content.Context;
import android.widget.Scroller;
public final class t0 extends Scroller {
    public final u0 f50698a;

    public t0(u0 u0Var, Context context) {
        super(context);
        this.f50698a = u0Var;
    }

    @Override
    public final void startScroll(int i9, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f50698a.f50710t0) {
            i14 = 3;
        } else {
            i14 = 1;
        }
        super.startScroll(i9, i10, i11, i12, i14 * i13);
    }
}
