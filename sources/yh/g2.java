package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ns0;
public final class g2 extends j71 {
    public final ns0 f50733g3;

    public g2(Context context, int i10, hg.o oVar, f2 f2Var, f2 f2Var2, g6 g6Var, ns0 ns0Var) {
        super(context, i10, 0, false, oVar, f2Var, f2Var2, g6Var, 3, 1);
        this.f50733g3 = ns0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50733g3.o();
    }
}
