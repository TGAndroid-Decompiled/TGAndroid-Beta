package sg;

import ai.z4;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw;
public final class g1 extends aw {
    public final l1 W;

    public g1(l1 l1Var, z4 z4Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(z4Var, context, d6Var, arrayList);
        this.W = l1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
