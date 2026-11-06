package tg;

import android.view.ViewGroup;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.oj0;
public final class i1 extends oj0 {
    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return sg.b0.c().size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        d1 d1Var2 = (d1) d1Var.f56952a;
        sg.b0 b0Var = (sg.b0) sg.b0.c().get(i7);
        d1Var2.getClass();
        d1Var2.setTypeface(b0Var.d());
        String str = b0Var.f54928c;
        if (str == null) {
            str = hd.N0(b0Var.f54927b);
        }
        d1Var2.setText(str);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        d1 d1Var = new d1(viewGroup.getContext());
        d1Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(d1Var);
    }
}
