package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.qm0;
public final class i7 extends o61 {
    public static final int f52708a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.p61 r33, boolean r34, org.telegram.ui.Components.c71 r35, org.telegram.ui.Components.k71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.i7.bindView(android.view.View, org.telegram.ui.Components.p61, boolean, org.telegram.ui.Components.c71, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        j7 j7Var = (j7) getCached();
        if (j7Var != null) {
            return j7Var;
        }
        return new j7(context, i10, e6Var);
    }
}
