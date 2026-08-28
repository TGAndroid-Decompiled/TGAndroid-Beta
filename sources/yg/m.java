package yg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.oh0;
public final class m extends k41 {
    public static final int f50248a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        oh0 oh0Var = (oh0) view;
        oh0Var.a((TLObject) l41Var.G, true, l41Var.f30352z);
        oh0Var.setOnClickListener(l41Var.D);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.B == l41Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        oh0 oh0Var = new oh0(context);
        oh0Var.setBackground(f6.K0(false));
        return oh0Var;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.B == l41Var2.B) {
            return true;
        }
        return false;
    }
}
