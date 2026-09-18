package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.or0;
public final class i2 extends f61 {
    public final or0 f45954f3;

    public i2(Context context, int i10, hi.a aVar, h2 h2Var, h2 h2Var2, f6 f6Var, or0 or0Var) {
        super(context, i10, 0, false, aVar, h2Var, h2Var2, f6Var, 3, 1);
        this.f45954f3 = or0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f45954f3.o();
    }
}
