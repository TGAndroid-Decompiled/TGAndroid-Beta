package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
public final class q7 extends h51 {
    public static final int f47637a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.i51 r33, boolean r34, org.telegram.ui.Components.w51 r35, org.telegram.ui.Components.e61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.q7.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.e61):void");
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        r7 r7Var = (r7) getCached();
        if (r7Var != null) {
            return r7Var;
        }
        return new r7(context, i10, e6Var);
    }
}
