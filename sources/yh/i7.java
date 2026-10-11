package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.rm0;
public final class i7 extends p61 {
    public static final int f52820a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.q61 r33, boolean r34, org.telegram.ui.Components.d71 r35, org.telegram.ui.Components.l71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: yh.i7.bindView(android.view.View, org.telegram.ui.Components.q61, boolean, org.telegram.ui.Components.d71, org.telegram.ui.Components.l71):void");
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        j7 j7Var = (j7) getCached();
        if (j7Var != null) {
            return j7Var;
        }
        return new j7(context, i10, d6Var);
    }
}
