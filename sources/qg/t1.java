package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.yl0;
public final class t1 extends yl0 {
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
        o1 o1Var = (o1) c1Var.f43068a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        o1Var.getClass();
        o1Var.setTypeface(k0Var.d());
        String str = k0Var.f41258c;
        if (str == null) {
            str = LocaleController.getString(k0Var.f41257b);
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
