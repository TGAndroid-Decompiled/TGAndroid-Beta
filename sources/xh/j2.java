package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gs0;
public final class j2 extends e71 {
    public final gs0 f50049m3;

    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, d6 d6Var, gs0 gs0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, d6Var, 3, 1);
        this.f50049m3 = gs0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50049m3.o();
    }
}
