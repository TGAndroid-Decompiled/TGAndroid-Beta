package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ll0;
public final class o7 extends g51 {
    public static final int f52426a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.h51 r33, boolean r34, org.telegram.ui.Components.v51 r35, org.telegram.ui.Components.d61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o7.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        p7 p7Var = (p7) getCached();
        if (p7Var != null) {
            return p7Var;
        }
        return new p7(context, i10, f6Var);
    }
}
