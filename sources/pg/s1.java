package pg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ul0;
public final class s1 extends ul0 {
    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return og.m0.c().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        n1 n1Var = (n1) c1Var.f41610a;
        og.m0 m0Var = (og.m0) og.m0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(m0Var.d());
        String str = m0Var.f14426c;
        if (str == null) {
            str = LocaleController.getString(m0Var.f14425b);
        }
        n1Var.setText(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(n1Var);
    }
}
