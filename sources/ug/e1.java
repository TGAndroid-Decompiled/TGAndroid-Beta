package ug;

import android.content.Context;
import bi.t6;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.wu;
public final class e1 extends wu {
    public final g1 R1;

    public e1(g1 g1Var, t6 t6Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(t6Var, context, e6Var, arrayList);
        this.R1 = g1Var;
    }

    @Override
    public final void L0() {
        this.R1.dismiss();
    }
}
