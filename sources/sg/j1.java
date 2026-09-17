package sg;

import android.content.Context;
import bi.l3;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rv;
public final class j1 extends rv {
    public final o1 W;

    public j1(o1 o1Var, l3 l3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(l3Var, context, f6Var, arrayList);
        this.W = o1Var;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
