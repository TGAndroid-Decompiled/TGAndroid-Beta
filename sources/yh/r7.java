package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
public final class r7 extends h51 {
    public static final int f47733a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.i51 r33, boolean r34, org.telegram.ui.Components.w51 r35, org.telegram.ui.Components.e61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.r7.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.e61):void");
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        s7 s7Var = (s7) getCached();
        if (s7Var != null) {
            return s7Var;
        }
        return new s7(context, i10, e6Var);
    }
}
