package wh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.da0;
public final class b extends da0 {
    public final d f45096a0;

    public b(d dVar, o2 o2Var, long j3) {
        super(o2Var, j3);
        this.f45096a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45096a0;
        b bVar = dVar.f45102i;
        if (bVar != null && !bVar.U.f45135b) {
            dVar.f45102i = null;
        }
        super.dismiss();
    }
}
