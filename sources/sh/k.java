package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.yz;
public final class k extends n41 {
    public static final int f57470b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        yz yzVar = new yz(context, null);
        yzVar.setViewType(16);
        yzVar.setMinimumHeight(g0.L(48.0f));
        return yzVar;
    }
}
