package ug;

import android.content.Context;
import bi.b9;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ev;
public final class f1 extends ev {
    public final h1 R1;

    public f1(h1 h1Var, b9 b9Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(b9Var, context, h6Var, arrayList);
        this.R1 = h1Var;
    }

    @Override
    public final void M0() {
        this.R1.dismiss();
    }
}
