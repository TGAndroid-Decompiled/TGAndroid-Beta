package ug;

import android.view.View;
import java.util.ArrayList;
public final class d0 implements View.OnClickListener {
    public final e0 f58640a;

    public d0(e0 e0Var) {
        this.f58640a = e0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        l0 l0Var = this.f58640a.f58646c;
        int i7 = l0.S2;
        l0Var.y1(arrayList);
    }
}
