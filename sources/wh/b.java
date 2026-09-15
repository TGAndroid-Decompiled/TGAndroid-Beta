package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.da0;
public final class b extends da0 {
    public final d f45073a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45073a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45073a0;
        b bVar = dVar.f45079i;
        if (bVar != null && !bVar.U.f45112b) {
            dVar.f45079i = null;
        }
        super.dismiss();
    }
}
