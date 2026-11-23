package ug;

import android.view.View;
import java.util.ArrayList;
public final class c0 implements View.OnClickListener {
    public final d0 f58677a;

    public c0(d0 d0Var) {
        this.f58677a = d0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        k0 k0Var = this.f58677a.f58684c;
        int i7 = k0.S2;
        k0Var.y1(arrayList);
    }
}
