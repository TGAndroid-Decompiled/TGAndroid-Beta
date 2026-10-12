package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.xs0;
public final class i2 extends p71 {
    public final xs0 f51531d3;

    public i2(Context context, int i10, hi.a aVar, h2 h2Var, h2 h2Var2, c6 c6Var, xs0 xs0Var) {
        super(context, i10, 0, false, aVar, h2Var, h2Var2, c6Var, 3, 1);
        this.f51531d3 = xs0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f51531d3.o();
    }
}
