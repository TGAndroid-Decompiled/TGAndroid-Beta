package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.js0;
public final class g2 extends b71 {
    public final js0 f50272d3;

    public g2(Context context, int i10, hg.o oVar, f2 f2Var, f2 f2Var2, d6 d6Var, js0 js0Var) {
        super(context, i10, 0, false, oVar, f2Var, f2Var2, d6Var, 3, 1);
        this.f50272d3 = js0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50272d3.o();
    }
}
