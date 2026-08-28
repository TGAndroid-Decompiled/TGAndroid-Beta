package yf;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.vk0;
public final class s1 extends vk0 {
    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return xf.i0.c().size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        n1 n1Var = (n1) q1Var.f5501a;
        xf.i0 i0Var = (xf.i0) xf.i0.c().get(i9);
        n1Var.getClass();
        n1Var.setTypeface(i0Var.d());
        String str = i0Var.f49242c;
        if (str == null) {
            str = LocaleController.getString(i0Var.f49241b);
        }
        n1Var.setText(str);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(n1Var);
    }
}
