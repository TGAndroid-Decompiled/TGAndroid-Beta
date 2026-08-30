package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class h extends h51 {
    public static final int f44957a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        long j10 = i51Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), i51Var.f25564k, i51Var.f25565l, i51Var.f25567n, i51Var.f25570q);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var, false);
    }
}
