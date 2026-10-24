package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ms0;
public final class g2 extends i71 {
    public final ms0 f50732g3;

    public g2(Context context, int i10, hg.o oVar, f2 f2Var, f2 f2Var2, g6 g6Var, ms0 ms0Var) {
        super(context, i10, 0, false, oVar, f2Var, f2Var2, g6Var, 3, 1);
        this.f50732g3 = ms0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50732g3.o();
    }
}
