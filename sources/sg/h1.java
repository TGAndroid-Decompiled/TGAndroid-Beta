package sg;

import ai.a5;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yv;
public final class h1 extends yv {
    public final m1 W;

    public h1(m1 m1Var, a5 a5Var, Context context, g6 g6Var, ArrayList arrayList) {
        super(a5Var, context, g6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void i0() {
        this.W.dismiss();
    }
}
