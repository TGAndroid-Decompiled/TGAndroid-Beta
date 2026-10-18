package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.is0;
public final class h2 extends a71 {
    public final is0 f50331d3;

    public h2(Context context, int i10, hg.o oVar, g2 g2Var, g2 g2Var2, d6 d6Var, is0 is0Var) {
        super(context, i10, 0, false, oVar, g2Var, g2Var2, d6Var, 3, 1);
        this.f50331d3 = is0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50331d3.o();
    }
}
