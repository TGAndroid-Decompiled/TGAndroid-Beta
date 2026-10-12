package wh;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.jb0;
public final class b extends jb0 {
    public final d f50620a0;

    public b(d dVar, m2 m2Var, long j3) {
        super(m2Var, j3);
        this.f50620a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f50620a0;
        b bVar = dVar.f50627i;
        if (bVar != null && !bVar.U.f50658b) {
            dVar.f50627i = null;
        }
        super.dismiss();
    }
}
