package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.sa0;
public final class b extends sa0 {
    public final d f45459a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f45459a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45459a0;
        b bVar = dVar.f45465i;
        if (bVar != null && !bVar.U.f45498b) {
            dVar.f45465i = null;
        }
        super.dismiss();
    }
}
