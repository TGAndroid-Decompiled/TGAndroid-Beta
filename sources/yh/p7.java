package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ml0;
public final class p7 extends g51 {
    public static final int f47566a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.h51 r33, boolean r34, org.telegram.ui.Components.v51 r35, org.telegram.ui.Components.d61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q7 q7Var = (q7) getCached();
        if (q7Var != null) {
            return q7Var;
        }
        return new q7(context, i10, d6Var);
    }
}
