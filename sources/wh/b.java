package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.fb0;
public final class b extends fb0 {
    public final d f50513a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f50513a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50513a0;
        b bVar = dVar.f50520i;
        if (bVar != null && !bVar.U.f50551b) {
            dVar.f50520i = null;
        }
        super.dismiss();
    }
}
