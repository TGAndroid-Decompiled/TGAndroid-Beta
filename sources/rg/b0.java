package rg;

import android.view.View;
import java.util.ArrayList;
public final class b0 implements View.OnClickListener {
    public final c0 f47202a;

    public b0(c0 c0Var) {
        this.f47202a = c0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        j0 j0Var = this.f47202a.f47211c;
        int i10 = j0.V0;
        j0Var.E1(arrayList);
    }
}
