package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wm0;
public final class i7 extends t61 {
    public static final int f52923a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.u61 r33, boolean r34, org.telegram.ui.Components.h71 r35, org.telegram.ui.Components.p71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.i7.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.h71, org.telegram.ui.Components.p71):void");
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        j7 j7Var = (j7) getCached();
        if (j7Var != null) {
            return j7Var;
        }
        return new j7(context, i10, c6Var);
    }
}
