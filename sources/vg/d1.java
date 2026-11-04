package vg;

import ai.c7;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.pu;
public final class d1 extends pu {
    public final h1 O1;

    public d1(h1 h1Var, c7 c7Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(c7Var, context, e6Var, arrayList);
        this.O1 = h1Var;
    }

    @Override
    public final void L0() {
        this.O1.dismiss();
    }
}
