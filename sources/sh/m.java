package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.qh0;
public final class m extends s61 {
    public static final int f48656a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        qh0 qh0Var = (qh0) view;
        qh0Var.a((TLObject) t61Var.G, true, t61Var.f32885z);
        qh0Var.setOnClickListener(t61Var.D);
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.B == t61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        qh0 qh0Var = new qh0(context);
        qh0Var.setBackground(y6.M0(false));
        return qh0Var;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.B == t61Var2.B) {
            return true;
        }
        return false;
    }
}
