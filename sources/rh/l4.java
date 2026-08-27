package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class l4 extends m41 {

    public static final int f47260a = 0;

    static {
        m41.setup(new l4());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        m4 m4Var = (m4) view;
        a aVar = (a) n41Var.G;
        i3 i3Var = (i3) n41Var.H;
        ArrayList arrayList = m4Var.f47284y;
        m4Var.f47594a = aVar;
        m4Var.J = i3Var;
        m4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = m4Var.f47594a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.f47028b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                    if (aVar.f47032g == null) {
                        aVar.f47032g = new s();
                    }
                }
            } else if (aVar.f47032g == null) {
                aVar.f47032g = new s();
            }
        }
        m4Var.n();
        m4Var.v.b();
        if (m4Var.S >= arrayList.size()) {
            m4Var.S = Math.max(0, arrayList.size() - 1);
        }
        m4Var.T = 0.0f;
        m4Var.Q.d(m4Var.l() ? 1.0f : 0.0f, true);
        m4Var.o(false);
        m4Var.requestLayout();
        m4Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        m4 m4Var = new m4(context, c6Var);
        m4Var.setBackground(new u1(g6.v0(g6.f23053d6, c6Var)));
        return m4Var;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
