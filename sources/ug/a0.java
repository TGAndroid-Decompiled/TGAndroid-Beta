package ug;

import android.view.View;
import java.util.ArrayList;
public final class a0 implements View.OnClickListener {
    public final b0 f56408a;

    public a0(b0 b0Var) {
        this.f56408a = b0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        i0 i0Var = this.f56408a.f56411c;
        int i7 = i0.O2;
        i0Var.x1(arrayList);
    }
}
