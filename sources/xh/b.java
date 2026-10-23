package xh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.za0;
public final class b extends za0 {
    public final d f50278b0;

    public b(d dVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.f50278b0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50278b0;
        b bVar = dVar.f50284i;
        if (bVar != null && !bVar.U.f50308b) {
            dVar.f50284i = null;
        }
        super.dismiss();
    }
}
