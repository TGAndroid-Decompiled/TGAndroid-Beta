package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fb0;
public final class b extends fb0 {
    public final d f50389a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f50389a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50389a0;
        b bVar = dVar.f50396i;
        if (bVar != null && !bVar.U.f50427b) {
            dVar.f50396i = null;
        }
        super.dismiss();
    }
}
