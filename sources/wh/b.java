package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gb0;
public final class b extends gb0 {
    public final d f50479a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f50479a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50479a0;
        b bVar = dVar.f50486i;
        if (bVar != null && !bVar.U.f50517b) {
            dVar.f50486i = null;
        }
        super.dismiss();
    }
}
