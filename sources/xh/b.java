package xh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ya0;
public final class b extends ya0 {
    public final d f49837a0;

    public b(d dVar, n2 n2Var, long j10) {
        super(n2Var, j10);
        this.f49837a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49837a0;
        b bVar = dVar.f49843i;
        if (bVar != null && !bVar.U.f49867b) {
            dVar.f49843i = null;
        }
        super.dismiss();
    }
}
