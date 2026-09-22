package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.da0;
public final class b extends da0 {
    public final d f45069a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45069a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45069a0;
        b bVar = dVar.f45075i;
        if (bVar != null && !bVar.U.f45108b) {
            dVar.f45075i = null;
        }
        super.dismiss();
    }
}
