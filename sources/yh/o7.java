package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
public final class o7 extends w51 {
    public static final int f47823a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.x51 r33, boolean r34, org.telegram.ui.Components.l61 r35, org.telegram.ui.Components.t61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.o7.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        p7 p7Var = (p7) getCached();
        if (p7Var != null) {
            return p7Var;
        }
        return new p7(context, i10, e6Var);
    }
}
