package ug;

import android.content.Context;
import bi.w4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ru;
public final class d1 extends ru {
    public final f1 N1;

    public d1(f1 f1Var, w4 w4Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(w4Var, context, f6Var, arrayList);
        this.N1 = f1Var;
    }

    @Override
    public final void L0() {
        this.N1.dismiss();
    }
}
