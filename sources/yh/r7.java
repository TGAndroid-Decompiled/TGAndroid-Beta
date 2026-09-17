package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ml0;
public final class r7 extends i51 {
    public static final int f47756a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.j51 r33, boolean r34, org.telegram.ui.Components.x51 r35, org.telegram.ui.Components.f61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.r7.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.f61):void");
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        s7 s7Var = (s7) getCached();
        if (s7Var != null) {
            return s7Var;
        }
        return new s7(context, i10, f6Var);
    }
}
