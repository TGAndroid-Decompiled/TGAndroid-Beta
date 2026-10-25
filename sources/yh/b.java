package yh;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.va0;
public final class b extends va0 {
    public final d f52578b0;

    public b(d dVar, r2 r2Var, long j10) {
        super(r2Var, j10);
        this.f52578b0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f52578b0;
        b bVar = dVar.f52584i;
        if (bVar != null && !bVar.U.f52608b) {
            dVar.f52584i = null;
        }
        super.dismiss();
    }
}
