package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.rs0;
public final class j2 extends k71 {
    public final rs0 f51318d3;

    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, e6 e6Var, rs0 rs0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, e6Var, 3, 1);
        this.f51318d3 = rs0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f51318d3.o();
    }
}
