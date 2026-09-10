package vh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.na0;
public final class c extends na0 {
    public final e f43359a0;

    public c(e eVar, p2 p2Var, long j3) {
        super(p2Var, j3);
        this.f43359a0 = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.f43359a0;
        c cVar = eVar.f43365i;
        if (cVar != null && !cVar.U.f43399b) {
            eVar.f43365i = null;
        }
        super.dismiss();
    }
}
