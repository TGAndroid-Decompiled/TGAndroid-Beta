package tg;

import android.view.ViewGroup;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.dk0;
public final class j1 extends dk0 {
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
        e1 e1Var2 = (e1) e1Var.f59111a;
        sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
        e1Var2.getClass();
        e1Var2.setTypeface(a0Var.d());
        String str = a0Var.f57166c;
        if (str == null) {
            str = hd.O0(a0Var.f57165b);
        }
        e1Var2.setText(str);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        e1 e1Var = new e1(viewGroup.getContext());
        e1Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(e1Var);
    }
}
