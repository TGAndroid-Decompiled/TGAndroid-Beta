package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vl0;
public final class s7 extends u51 {
    public static final int f46039a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.v51 r33, boolean r34, org.telegram.ui.Components.j61 r35, org.telegram.ui.Components.r61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: xh.s7.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        t7 t7Var = (t7) getCached();
        if (t7Var != null) {
            return t7Var;
        }
        return new t7(context, i10, f6Var);
    }
}
