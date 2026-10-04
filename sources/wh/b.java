package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ra0;
public final class b extends ra0 {
    public final d f49091a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f49091a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49091a0;
        b bVar = dVar.f49098i;
        if (bVar != null && !bVar.U.f49135b) {
            dVar.f49098i = null;
        }
        super.dismiss();
    }
}
