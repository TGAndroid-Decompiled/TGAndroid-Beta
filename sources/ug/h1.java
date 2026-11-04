package ug;

import android.view.ViewGroup;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.sj0;
public final class h1 extends sj0 {
    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return tg.b0.c().size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        c1 c1Var = (c1) d1Var.f55540a;
        tg.b0 b0Var = (tg.b0) tg.b0.c().get(i3);
        c1Var.getClass();
        c1Var.setTypeface(b0Var.d());
        String str = b0Var.f55130c;
        if (str == null) {
            str = bd.N0(b0Var.f55129b);
        }
        c1Var.setText(str);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        c1 c1Var = new c1(viewGroup.getContext());
        c1Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(c1Var);
    }
}
