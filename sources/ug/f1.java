package ug;

import android.content.Context;
import bi.e9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.dv;
public final class f1 extends dv {
    public final h1 R1;

    public f1(h1 h1Var, e9 e9Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(e9Var, context, h6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override
    public final void M0() {
        this.R1.dismiss();
    }
}
