package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.nr0;
public final class h2 extends d61 {
    public final nr0 f50357f3;

    public h2(Context context, int i10, ii.a aVar, g2 g2Var, g2 g2Var2, f6 f6Var, nr0 nr0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, f6Var, 3, 1);
        this.f50357f3 = nr0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50357f3.o();
    }
}
