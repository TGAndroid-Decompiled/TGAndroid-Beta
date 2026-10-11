package rg;

import android.view.View;
import java.util.ArrayList;
public final class b0 implements View.OnClickListener {
    public final c0 f47328a;

    public b0(c0 c0Var) {
        this.f47328a = c0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        j0 j0Var = this.f47328a.f47337c;
        int i10 = j0.V0;
        j0Var.E1(arrayList);
    }
}
