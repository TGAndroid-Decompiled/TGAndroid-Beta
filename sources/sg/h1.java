package sg;

import ai.a5;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;
public final class h1 extends aw {
    public final m1 W;

    public h1(m1 m1Var, a5 a5Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(a5Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
