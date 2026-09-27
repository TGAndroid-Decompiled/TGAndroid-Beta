package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.t61;
public final class k2 extends t61 {
    public final bs0 f46319f3;

    public k2(Context context, int i10, hi.a aVar, j2 j2Var, j2 j2Var2, e6 e6Var, bs0 bs0Var) {
        super(context, i10, 0, false, aVar, j2Var, j2Var2, e6Var, 3, 1);
        this.f46319f3 = bs0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f46319f3.o();
    }
}
