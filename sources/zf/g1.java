package zf;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.dv;
public final class g1 extends dv {
    public final k1 S;

    public g1(k1 k1Var, bg.i1 i1Var, Context context, b6 b6Var, ArrayList arrayList) {
        super(i1Var, context, b6Var, arrayList);
        this.S = k1Var;
    }

    @Override
    public final void X() {
        this.S.dismiss();
    }
}
