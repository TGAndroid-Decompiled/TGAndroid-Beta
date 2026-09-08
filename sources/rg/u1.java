package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kl0;
public final class u1 extends kl0 {
    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return qg.j0.c().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        p1 p1Var = (p1) c1Var.f45766a;
        qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
        p1Var.getClass();
        p1Var.setTypeface(j0Var.d());
        String str = j0Var.f44484c;
        if (str == null) {
            str = LocaleController.getString(j0Var.f44483b);
        }
        p1Var.setText(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(viewGroup.getContext());
        p1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(p1Var);
    }
}
