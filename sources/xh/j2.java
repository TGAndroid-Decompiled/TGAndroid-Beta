package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.yr0;
public final class j2 extends s61 {
    public final yr0 f46244f3;

    public j2(Context context, int i10, hi.a aVar, i2 i2Var, i2 i2Var2, f6 f6Var, yr0 yr0Var) {
        super(context, i10, 0, false, aVar, i2Var, i2Var2, f6Var, 3, 1);
        this.f46244f3 = yr0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f46244f3.o();
    }
}
