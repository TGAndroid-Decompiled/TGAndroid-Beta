package rg;

import ai.z3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.iw;
public final class h1 extends iw {
    public final l1 W;

    public h1(l1 l1Var, z3 z3Var, Context context, e6 e6Var, ArrayList arrayList) {
        super(z3Var, context, e6Var, arrayList);
        this.W = l1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
