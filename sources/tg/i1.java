package tg;

import android.view.ViewGroup;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.tj0;
public final class i1 extends tj0 {
    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return sg.a0.c().size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        d1 d1Var = (d1) e1Var.f58535a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        d1Var.getClass();
        d1Var.setTypeface(a0Var.d());
        String str = a0Var.f56582c;
        if (str == null) {
            str = hd.N0(a0Var.f56581b);
        }
        d1Var.setText(str);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(d1Var);
    }
}
