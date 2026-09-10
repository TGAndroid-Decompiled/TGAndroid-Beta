package qg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wv;
public final class j1 extends wv {
    public final m1 W;

    public j1(m1 m1Var, bi.o1 o1Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(o1Var, context, f6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
