package wh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.qa0;
public final class b extends qa0 {
    public final d f45397a0;

    public b(d dVar, o2 o2Var, long j3) {
        super(o2Var, j3);
        this.f45397a0 = dVar;
    }

    @Override
    public final void dismiss() {
        d dVar = this.f45397a0;
        b bVar = dVar.f45403i;
        if (bVar != null && !bVar.U.f45436b) {
            dVar.f45403i = null;
        }
        super.dismiss();
    }
}
