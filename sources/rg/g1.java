package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.tv;
public final class g1 extends tv {
    public final k1 W;

    public g1(k1 k1Var, y3 y3Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y3Var, context, f6Var, arrayList);
        this.W = k1Var;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
