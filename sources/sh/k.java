package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.mf0;
public final class k extends k41 {
    public static final int f57461b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        mf0 mf0Var = (mf0) view;
        mf0Var.a((TLObject) l41Var.H, l41Var.A, true);
        mf0Var.setOnClickListener(l41Var.E);
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.C == l41Var2.C) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        mf0 mf0Var = new mf0(context);
        mf0Var.setBackground(n6.N0(false));
        return mf0Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.C == l41Var2.C) {
            return true;
        }
        return false;
    }
}
