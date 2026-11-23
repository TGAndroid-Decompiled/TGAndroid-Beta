package ug;

import android.content.Context;
import bi.e9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bv;
public final class f1 extends bv {
    public final h1 R1;

    public f1(h1 h1Var, e9 e9Var, Context context, i6 i6Var, ArrayList arrayList) {
        super(e9Var, context, i6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override
    public final void M0() {
        this.R1.dismiss();
    }
}
