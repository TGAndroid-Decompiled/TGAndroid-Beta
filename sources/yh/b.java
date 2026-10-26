package yh;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.va0;
public final class b extends va0 {
    public final d f52581b0;

    public b(d dVar, r2 r2Var, long j10) {
        super(r2Var, j10);
        this.f52581b0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f52581b0;
        b bVar = dVar.f52587i;
        if (bVar != null && !bVar.U.f52611b) {
            dVar.f52587i = null;
        }
        super.dismiss();
    }
}
