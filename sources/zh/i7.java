package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mm0;
public final class i7 extends k61 {
    public static final int f50678a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.l61 r33, boolean r34, org.telegram.ui.Components.z61 r35, org.telegram.ui.Components.h71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: zh.i7.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.z61, org.telegram.ui.Components.h71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        j7 j7Var = (j7) getCached();
        if (j7Var != null) {
            return j7Var;
        }
        return new j7(context, i10, c6Var);
    }
}
