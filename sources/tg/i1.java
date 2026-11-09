package tg;

import android.view.ViewGroup;
import org.telegram.messenger.id;
import org.telegram.ui.Components.pj0;
public final class i1 extends pj0 {
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
        d1 d1Var2 = (d1) d1Var.f57056a;
        sg.b0 b0Var = (sg.b0) sg.b0.c().get(i7);
        d1Var2.getClass();
        d1Var2.setTypeface(b0Var.d());
        String str = b0Var.f55032c;
        if (str == null) {
            str = id.N0(b0Var.f55031b);
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
