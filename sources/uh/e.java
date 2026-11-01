package uh;

import android.content.Context;
import org.telegram.ui.Components.ew0;
import th.x4;
public final class e extends h {
    public final i f50252w;

    public e(i iVar, Context context) {
        super(iVar, context);
        this.f50252w = iVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        i iVar = this.f50252w;
        if (iVar.f50264r.getVisibility() == 0) {
            iVar.f50267x.f();
        }
        ew0 ew0Var = iVar.D;
        if (ew0Var != null) {
            x4 x4Var = this.e;
            if (x4Var != null && x4Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ew0Var.e(z10, true);
        }
    }
}
