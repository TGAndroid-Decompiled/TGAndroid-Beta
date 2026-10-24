package xh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xa0;
public final class b extends xa0 {
    public final d f50277b0;

    public b(d dVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.f50277b0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50277b0;
        b bVar = dVar.f50283i;
        if (bVar != null && !bVar.U.f50307b) {
            dVar.f50283i = null;
        }
        super.dismiss();
    }
}
