package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wl0;
public final class p7 extends u51 {
    public static final int f47874a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.v51 r33, boolean r34, org.telegram.ui.Components.j61 r35, org.telegram.ui.Components.r61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q7 q7Var = (q7) getCached();
        if (q7Var != null) {
            return q7Var;
        }
        return new q7(context, i10, d6Var);
    }
}
