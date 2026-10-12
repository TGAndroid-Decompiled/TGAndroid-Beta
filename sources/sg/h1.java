package sg;

import android.content.Context;
import bi.o3;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ew;
public final class h1 extends ew {
    public final m1 W;

    public h1(m1 m1Var, o3 o3Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(o3Var, context, c6Var, arrayList);
        this.W = m1Var;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
