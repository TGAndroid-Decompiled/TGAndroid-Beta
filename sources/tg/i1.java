package tg;

import android.view.ViewGroup;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bk0;
public final class i1 extends bk0 {
    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return sg.a0.c().size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        d1 d1Var = (d1) f1Var.f59123a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        d1Var.getClass();
        d1Var.setTypeface(a0Var.d());
        String str = a0Var.f57156c;
        if (str == null) {
            str = gd.N0(a0Var.f57155b);
        }
        d1Var.setText(str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(d1Var);
    }
}
