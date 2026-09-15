package qg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kl0;
public final class v1 extends kl0 {
    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return pg.j0.c().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        q1 q1Var = (q1) c1Var.f42675a;
        pg.j0 j0Var = (pg.j0) pg.j0.c().get(i10);
        q1Var.getClass();
        q1Var.setTypeface(j0Var.d());
        String str = j0Var.f40889c;
        if (str == null) {
            str = LocaleController.getString(j0Var.f40888b);
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
