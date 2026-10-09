package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pm0;
public final class s1 extends pm0 {
    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return pg.k0.c().size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        n1 n1Var = (n1) d1Var.f47656a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(k0Var.d());
        String str = k0Var.f45674c;
        if (str == null) {
            str = LocaleController.getString(k0Var.f45673b);
        }
        n1Var.setText(str);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(n1Var);
    }
}
