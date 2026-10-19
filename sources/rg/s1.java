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
        return qg.m0.c().size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        n1 n1Var = (n1) b1Var.f45912a;
        qg.m0 m0Var = (qg.m0) qg.m0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(m0Var.d());
        String str = m0Var.f44559c;
        if (str == null) {
            str = LocaleController.getString(m0Var.f44558b);
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
