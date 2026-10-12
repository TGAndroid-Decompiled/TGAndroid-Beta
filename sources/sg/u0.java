package sg;

import android.content.Context;
import android.widget.Scroller;
public final class u0 extends Scroller {
    public final v0 f45366a;

    public u0(v0 v0Var, Context context) {
        super(context);
        this.f45366a = v0Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f45366a.f45377x0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}
