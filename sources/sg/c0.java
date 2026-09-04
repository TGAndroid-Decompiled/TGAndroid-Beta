package sg;

import android.view.View;
import java.util.ArrayList;
public final class c0 implements View.OnClickListener {
    public final d0 f46030a;

    public c0(d0 d0Var) {
        this.f46030a = d0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        k0 k0Var = this.f46030a.f46063c;
        int i10 = k0.V0;
        k0Var.D1(arrayList);
    }
}
