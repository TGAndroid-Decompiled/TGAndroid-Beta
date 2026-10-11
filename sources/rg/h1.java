package rg;

import ai.z3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.jw;
public final class h1 extends jw {
    public final l1 W;

    public h1(l1 l1Var, z3 z3Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(z3Var, context, d6Var, arrayList);
        this.W = l1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
