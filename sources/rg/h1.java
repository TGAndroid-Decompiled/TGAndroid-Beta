package rg;

import ai.y3;
import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.wv;
public final class h1 extends wv {
    public final m1 W;

    public h1(m1 m1Var, y3 y3Var, Context context, d6 d6Var, ArrayList arrayList) {
        super(y3Var, context, d6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void X() {
        this.W.dismiss();
    }
}
