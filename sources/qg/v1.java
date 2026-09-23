package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ll0;
public final class v1 extends ll0 {
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
        q1 q1Var = (q1) c1Var.f42627a;
        pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
        q1Var.getClass();
        q1Var.setTypeface(k0Var.d());
        String str = k0Var.f40843c;
        if (str == null) {
            str = LocaleController.getString(k0Var.f40842b);
        }
        q1Var.setText(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        q1 q1Var = new q1(viewGroup.getContext());
        q1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(q1Var);
    }
}
