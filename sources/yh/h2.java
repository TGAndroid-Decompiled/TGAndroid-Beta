package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ns0;
public final class h2 extends i71 {
    public final ns0 f48912d3;

    public h2(Context context, int i10, ii.a aVar, g2 g2Var, g2 g2Var2, c6 c6Var, ns0 ns0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, c6Var, 3, 1);
        this.f48912d3 = ns0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f48912d3.o();
    }
}
