package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ea0;
public final class b extends ea0 {
    public final d f45023a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45023a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45023a0;
        b bVar = dVar.f45029i;
        if (bVar != null && !bVar.U.f45062b) {
            dVar.f45029i = null;
        }
        super.dismiss();
    }
}
