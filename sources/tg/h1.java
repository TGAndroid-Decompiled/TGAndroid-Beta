package tg;

import android.content.Context;
import bi.v4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aw;
public final class h1 extends aw {
    public final m1 W;

    public h1(m1 m1Var, v4 v4Var, Context context, u6 u6Var, ArrayList arrayList) {
        super(v4Var, context, u6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void i0() {
        this.W.dismiss();
    }
}
