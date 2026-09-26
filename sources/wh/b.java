package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.pa0;
public final class b extends pa0 {
    public final d f45351a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f45351a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45351a0;
        b bVar = dVar.f45357i;
        if (bVar != null && !bVar.U.f45390b) {
            dVar.f45357i = null;
        }
        super.dismiss();
    }
}
