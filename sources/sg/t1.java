package sg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.mm0;
public final class t1 extends mm0 {
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
        o1 o1Var = (o1) e1Var.f47773a;
        rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(j0Var.d());
        String str = j0Var.f47477c;
        if (str == null) {
            str = LocaleController.getString(j0Var.f47476b);
        }
        o1Var.setText(str);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(o1Var);
    }
}
