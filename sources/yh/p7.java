package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zl0;
public final class p7 extends x51 {
    public static final int f47993a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.y51 r33, boolean r34, org.telegram.ui.Components.m61 r35, org.telegram.ui.Components.u61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q7 q7Var = (q7) getCached();
        if (q7Var != null) {
            return q7Var;
        }
        return new q7(context, i10, d6Var);
    }
}
