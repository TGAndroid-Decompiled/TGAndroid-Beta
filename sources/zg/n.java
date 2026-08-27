package zg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.qh0;

public final class n extends m41 {

    public static final int f50846a = 0;

    static {
        m41.setup(new n());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        qh0 qh0Var = (qh0) view;
        qh0Var.a((TLObject) n41Var.G, true, n41Var.f30857z);
        qh0Var.setOnClickListener(n41Var.D);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        qh0 qh0Var = new qh0(context);
        qh0Var.setBackground(g6.K0(false));
        return qh0Var;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B;
    }
}
