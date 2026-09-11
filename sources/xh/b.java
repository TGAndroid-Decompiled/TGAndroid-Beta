package xh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ea0;
public final class b extends ea0 {
    public final d f49399a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f49399a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f49399a0;
        b bVar = dVar.f49406i;
        if (bVar != null && !bVar.U.f49443b) {
            dVar.f49406i = null;
        }
        super.dismiss();
    }
}
