package sg;

import ai.z4;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;
public final class h1 extends aw {
    public final m1 W;

    public h1(m1 m1Var, z4 z4Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(z4Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
