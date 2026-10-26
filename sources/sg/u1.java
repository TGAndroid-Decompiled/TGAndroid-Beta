package sg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lm0;
public final class u1 extends lm0 {
    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return rg.j0.c().size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        p1 p1Var = (p1) e1Var.f47738a;
        rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
        p1Var.getClass();
        p1Var.setTypeface(j0Var.d());
        String str = j0Var.f47442c;
        if (str == null) {
            str = LocaleController.getString(j0Var.f47441b);
        }
        p1Var.setText(str);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(viewGroup.getContext());
        p1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(p1Var);
    }
}
