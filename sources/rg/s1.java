package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hm0;
public final class s1 extends hm0 {
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
        n1 n1Var = (n1) b1Var.f45910a;
        qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(l0Var.d());
        String str = l0Var.f44557c;
        if (str == null) {
            str = LocaleController.getString(l0Var.f44556b);
        }
        n1Var.setText(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(n1Var);
    }
}
