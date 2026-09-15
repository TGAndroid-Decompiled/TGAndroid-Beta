package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.nr0;
public final class i2 extends e61 {
    public final nr0 f45926f3;

    public i2(Context context, int i10, hi.a aVar, h2 h2Var, h2 h2Var2, e6 e6Var, nr0 nr0Var) {
        super(context, i10, 0, false, aVar, h2Var, h2Var2, e6Var, 3, 1);
        this.f45926f3 = nr0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f45926f3.o();
    }
}
