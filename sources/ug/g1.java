package ug;

import android.content.Context;
import bi.y8;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bv;
public final class g1 extends bv {
    public final i1 R1;

    public g1(i1 i1Var, y8 y8Var, Context context, i6 i6Var, ArrayList arrayList) {
        super(y8Var, context, i6Var, arrayList);
        this.R1 = i1Var;
    }

    @Override
    public final void M0() {
        this.R1.dismiss();
    }
}
