package wh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.la0;
public final class b extends la0 {
    public final d f45368a0;

    public b(d dVar, n2 n2Var, long j3) {
        super(n2Var, j3);
        this.f45368a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45368a0;
        b bVar = dVar.f45374i;
        if (bVar != null && !bVar.U.f45407b) {
            dVar.f45374i = null;
        }
        super.dismiss();
    }
}
