package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.zl0;
public final class s7 extends g61 {
    public static final int f51981a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.h61 r33, boolean r34, org.telegram.ui.Components.w61 r35, org.telegram.ui.Components.e71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s7.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.w61, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        t7 t7Var = (t7) getCached();
        if (t7Var != null) {
            return t7Var;
        }
        return new t7(context, i10, d6Var);
    }
}
