package tg;

import android.view.ViewGroup;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.dk0;
public final class j1 extends dk0 {
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
        e1 e1Var = (e1) f1Var.f59161a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        e1Var.getClass();
        e1Var.setTypeface(a0Var.d());
        String str = a0Var.f57197c;
        if (str == null) {
            str = gd.O0(a0Var.f57196b);
        }
        e1Var.setText(str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        e1 e1Var = new e1(viewGroup.getContext());
        e1Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(e1Var);
    }
}
