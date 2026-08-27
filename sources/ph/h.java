package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class h extends m41 {

    public static final int f46050a = 0;

    static {
        m41.setup(new h());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        long j10 = n41Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), n41Var.f30843k, n41Var.f30844l, n41Var.f30846n, n41Var.f30849q);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var, false);
    }
}
