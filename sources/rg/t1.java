package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.km0;
public final class t1 extends km0 {
    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return qg.l0.c().size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        o1 o1Var = (o1) b1Var.f46342a;
        qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(l0Var.d());
        String str = l0Var.f44979c;
        if (str == null) {
            str = LocaleController.getString(l0Var.f44978b);
        }
        o1Var.setText(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(o1Var);
    }
}
