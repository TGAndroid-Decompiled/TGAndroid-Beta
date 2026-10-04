package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ra0;
public final class b extends ra0 {
    public final d f49100a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f49100a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49100a0;
        b bVar = dVar.f49107i;
        if (bVar != null && !bVar.U.f49144b) {
            dVar.f49107i = null;
        }
        super.dismiss();
    }
}
