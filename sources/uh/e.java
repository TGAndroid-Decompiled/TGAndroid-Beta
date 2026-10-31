package uh;

import android.content.Context;
import org.telegram.ui.Components.dw0;
import th.x4;
public final class e extends h {
    public final i f50238w;

    public e(i iVar, Context context) {
        super(iVar, context);
        this.f50238w = iVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        i iVar = this.f50238w;
        if (iVar.f50250r.getVisibility() == 0) {
            iVar.f50253x.f();
        }
        dw0 dw0Var = iVar.D;
        if (dw0Var != null) {
            x4 x4Var = this.e;
            if (x4Var != null && x4Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            dw0Var.e(z10, true);
        }
    }
}
