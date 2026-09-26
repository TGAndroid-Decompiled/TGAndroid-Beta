package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.qa0;
public final class b extends qa0 {
    public final d f45350a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f45350a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45350a0;
        b bVar = dVar.f45356i;
        if (bVar != null && !bVar.U.f45389b) {
            dVar.f45356i = null;
        }
        super.dismiss();
    }
}
