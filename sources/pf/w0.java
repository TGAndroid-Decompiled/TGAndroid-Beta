package pf;

import android.content.Context;
import android.view.View;
import jh.d6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class w0 extends m41 {

    public static final int f45961a = 0;

    static {
        m41.setup(new w0());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((x0) view).a((d6) n41Var.G);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new x0(context, c6Var);
    }
}
