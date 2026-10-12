package rg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lm0;
public final class u1 extends lm0 {
    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return qg.j0.c().size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        p1 p1Var = (p1) b1Var.f44838a;
        qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
        p1Var.getClass();
        p1Var.setTypeface(j0Var.d());
        String str = j0Var.f43462c;
        if (str == null) {
            str = LocaleController.getString(j0Var.f43461b);
        }
        p1Var.setText(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(p1Var);
    }
}
