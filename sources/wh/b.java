package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ra0;
public final class b extends ra0 {
    public final d f45353a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f45353a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45353a0;
        b bVar = dVar.f45359i;
        if (bVar != null && !bVar.U.f45392b) {
            dVar.f45359i = null;
        }
        super.dismiss();
    }
}
