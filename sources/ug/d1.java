package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qu;
public final class d1 extends qu {
    public final f1 Q1;

    public d1(f1 f1Var, w4 w4Var, Context context, h6 h6Var, ArrayList arrayList) {
        super(w4Var, context, h6Var, arrayList);
        this.Q1 = f1Var;
    }

    @Override
    public final void L0() {
        this.Q1.dismiss();
    }
}
