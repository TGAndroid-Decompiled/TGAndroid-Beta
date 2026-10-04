package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.zl0;
public final class q7 extends f61 {
    public static final int f51871a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.g61 r33, boolean r34, org.telegram.ui.Components.u61 r35, org.telegram.ui.Components.c71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.q7.bindView(android.view.View, org.telegram.ui.Components.g61, boolean, org.telegram.ui.Components.u61, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        r7 r7Var = (r7) getCached();
        if (r7Var != null) {
            return r7Var;
        }
        return new r7(context, i10, d6Var);
    }
}
