package yh;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.wa0;
public final class b extends wa0 {
    public final d f52639b0;

    public b(d dVar, r2 r2Var, long j10) {
        super(r2Var, j10);
        this.f52639b0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f52639b0;
        b bVar = dVar.f52645i;
        if (bVar != null && !bVar.U.f52669b) {
            dVar.f52645i = null;
        }
        super.dismiss();
    }
}
