package ug;

import android.view.View;
import java.util.ArrayList;
public final class b0 implements View.OnClickListener {
    public final c0 f58045a;

    public b0(c0 c0Var) {
        this.f58045a = c0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        j0 j0Var = this.f58045a.f58054c;
        int i7 = j0.S2;
        j0Var.x1(arrayList);
    }
}
