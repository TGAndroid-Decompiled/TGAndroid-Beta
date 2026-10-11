package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.sm0;
public final class i7 extends q61 {
    public static final int f52786a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.r61 r33, boolean r34, org.telegram.ui.Components.e71 r35, org.telegram.ui.Components.m71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.i7.bindView(android.view.View, org.telegram.ui.Components.r61, boolean, org.telegram.ui.Components.e71, org.telegram.ui.Components.m71):void");
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        j7 j7Var = (j7) getCached();
        if (j7Var != null) {
            return j7Var;
        }
        return new j7(context, i10, d6Var);
    }
}
