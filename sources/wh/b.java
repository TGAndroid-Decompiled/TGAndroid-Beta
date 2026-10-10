package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.gb0;
public final class b extends gb0 {
    public final d f50435a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f50435a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50435a0;
        b bVar = dVar.f50442i;
        if (bVar != null && !bVar.U.f50473b) {
            dVar.f50442i = null;
        }
        super.dismiss();
    }
}
