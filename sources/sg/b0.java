package sg;

import android.view.View;
import java.util.ArrayList;
public final class b0 implements View.OnClickListener {
    public final c0 f46642a;

    public b0(c0 c0Var) {
        this.f46642a = c0Var;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel());
        j0 j0Var = this.f46642a.f46650c;
        int i10 = j0.W0;
        j0Var.H1(arrayList);
    }
}
