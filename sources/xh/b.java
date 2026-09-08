package xh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ea0;
public final class b extends ea0 {
    public final d f49428a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f49428a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49428a0;
        b bVar = dVar.f49435i;
        if (bVar != null && !bVar.U.f49472b) {
            dVar.f49435i = null;
        }
        super.dismiss();
    }
}
