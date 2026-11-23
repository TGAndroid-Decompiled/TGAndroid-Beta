package tg;

import android.view.ViewGroup;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.dk0;
public final class n1 extends dk0 {
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
        i1 i1Var = (i1) f1Var.f59245a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        i1Var.getClass();
        i1Var.setTypeface(a0Var.d());
        String str = a0Var.f57280c;
        if (str == null) {
            str = gd.O0(a0Var.f57279b);
        }
        i1Var.setText(str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        i1 i1Var = new i1(viewGroup.getContext());
        i1Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(i1Var);
    }
}
