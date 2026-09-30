package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yl0;
public final class p7 extends w51 {
    public static final int f47887a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.x51 r33, boolean r34, org.telegram.ui.Components.l61 r35, org.telegram.ui.Components.t61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q7 q7Var = (q7) getCached();
        if (q7Var != null) {
            return q7Var;
        }
        return new q7(context, i10, d6Var);
    }
}
