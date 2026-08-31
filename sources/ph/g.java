package ph;

import android.content.Context;
import oh.l6;
import org.telegram.ui.Components.ax0;
public final class g extends k {
    public final l v;

    public g(l lVar, Context context) {
        super(lVar, context);
        this.v = lVar;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        l lVar = this.v;
        if (lVar.f44397r.getVisibility() == 0) {
            lVar.f44399w.l();
        }
        ax0 ax0Var = lVar.f44401y;
        if (ax0Var != null) {
            l6 l6Var = this.f44386e;
            if (l6Var != null && l6Var.k()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ax0Var.e(z4, true);
        }
    }
}
