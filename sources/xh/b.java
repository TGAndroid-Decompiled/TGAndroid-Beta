package xh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ea0;
public final class b extends ea0 {
    public final d f49400a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f49400a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49400a0;
        b bVar = dVar.f49407i;
        if (bVar != null && !bVar.U.f49444b) {
            dVar.f49407i = null;
        }
        super.dismiss();
    }
}
