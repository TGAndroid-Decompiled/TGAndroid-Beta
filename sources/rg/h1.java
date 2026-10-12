package rg;

import ai.z3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.lw;
public final class h1 extends lw {
    public final l1 W;

    public h1(l1 l1Var, z3 z3Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(z3Var, context, c6Var, arrayList);
        this.W = l1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
