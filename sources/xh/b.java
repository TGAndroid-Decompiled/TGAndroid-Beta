package xh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.eb0;
public final class b extends eb0 {
    public final d f48442a0;

    public b(d dVar, m2 m2Var, long j10) {
        super(m2Var, j10);
        this.f48442a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f48442a0;
        b bVar = dVar.f48448i;
        if (bVar != null && !bVar.U.f48476b) {
            dVar.f48448i = null;
        }
        super.dismiss();
    }
}
