package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ma0;
public final class b extends ma0 {
    public final d f45324a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45324a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45324a0;
        b bVar = dVar.f45330i;
        if (bVar != null && !bVar.U.f45363b) {
            dVar.f45330i = null;
        }
        super.dismiss();
    }
}
