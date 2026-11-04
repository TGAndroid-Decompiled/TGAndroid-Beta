package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.tj0;
public final class l extends q31 {
    public static final int f55428b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        iz izVar = new iz(context, null);
        izVar.setViewType(16);
        izVar.setMinimumHeight(g0.L(48.0f));
        return izVar;
    }
}
