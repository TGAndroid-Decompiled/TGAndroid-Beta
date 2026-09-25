package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.vl0;
public final class t1 extends vl0 {
    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return pg.k0.c().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        o1 o1Var = (o1) c1Var.f42961a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(k0Var.d());
        String str = k0Var.f41160c;
        if (str == null) {
            str = LocaleController.getString(k0Var.f41159b);
        }
        o1Var.setText(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(viewGroup.getContext());
        o1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(o1Var);
    }
}
