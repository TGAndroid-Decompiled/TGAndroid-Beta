package vg;

import android.view.View;
import java.util.ArrayList;
public final class a0 implements View.OnClickListener {
    public final b0 f56570a;

    public a0(b0 b0Var) {
        this.f56570a = b0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        i0 i0Var = this.f56570a.f56572c;
        int i3 = i0.P2;
        i0Var.x1(arrayList);
    }
}
