package zf;

import android.view.View;
import java.util.ArrayList;
public final class a0 implements View.OnClickListener {
    public final c0 f50454a;

    public a0(c0 c0Var) {
        this.f50454a = c0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        j0 j0Var = this.f50454a.f50478c;
        int i9 = j0.R0;
        j0Var.D1(arrayList);
    }
}
