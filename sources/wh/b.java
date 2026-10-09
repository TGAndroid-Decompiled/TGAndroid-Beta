package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fb0;
public final class b extends fb0 {
    public final d f50391a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f50391a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50391a0;
        b bVar = dVar.f50398i;
        if (bVar != null && !bVar.U.f50429b) {
            dVar.f50398i = null;
        }
        super.dismiss();
    }
}
