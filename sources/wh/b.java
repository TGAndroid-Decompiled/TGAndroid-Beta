package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.oa0;
public final class b extends oa0 {
    public final d f45389a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45389a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45389a0;
        b bVar = dVar.f45395i;
        if (bVar != null && !bVar.U.f45428b) {
            dVar.f45395i = null;
        }
        super.dismiss();
    }
}
