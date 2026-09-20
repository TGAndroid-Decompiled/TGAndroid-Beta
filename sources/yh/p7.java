package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class p7 extends v51 {
    public static final int f47919a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.w51 r33, boolean r34, org.telegram.ui.Components.k61 r35, org.telegram.ui.Components.s61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.bindView(android.view.View, org.telegram.ui.Components.w51, boolean, org.telegram.ui.Components.k61, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        q7 q7Var = (q7) getCached();
        if (q7Var != null) {
            return q7Var;
        }
        return new q7(context, i10, f6Var);
    }
}
