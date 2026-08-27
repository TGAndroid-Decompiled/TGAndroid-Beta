package zf;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class s1 extends yk0 {
    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return yf.i0.c().size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        n1 n1Var = (n1) o1Var.f5789a;
        yf.i0 i0Var = (yf.i0) yf.i0.c().get(i10);
        n1Var.getClass();
        n1Var.setTypeface(i0Var.d());
        String string = i0Var.f49950c;
        if (string == null) {
            string = LocaleController.getString(i0Var.f49949b);
        }
        n1Var.setText(string);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(viewGroup.getContext());
        n1Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(n1Var);
    }
}
