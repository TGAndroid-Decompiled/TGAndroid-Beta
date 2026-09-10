package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wr0;
public final class h2 extends r61 {
    public final wr0 f44135f3;

    public h2(Context context, int i10, gi.a aVar, g2 g2Var, g2 g2Var2, f6 f6Var, wr0 wr0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, f6Var, 3, 1);
        this.f44135f3 = wr0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f44135f3.o();
    }
}
