package wh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.da0;
public final class b extends da0 {
    public final d f45101a0;

    public b(d dVar, o2 o2Var, long j3) {
        super(o2Var, j3);
        this.f45101a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45101a0;
        b bVar = dVar.f45107i;
        if (bVar != null && !bVar.U.f45140b) {
            dVar.f45107i = null;
        }
        super.dismiss();
    }
}
