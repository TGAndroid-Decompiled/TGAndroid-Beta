package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class si extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f41117f;
    public final sn f41118g;
    public final Object h;

    public si(sn snVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f41118g = snVar;
        this.e = i10;
        this.h = obj;
        this.f41117f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                sn snVar = this.f41118g;
                snVar.f41430wb = i10;
                snVar.f41444xb = 1;
                snVar.f41457yb = (CharacterStyle) this.h;
                this.f41117f.invalidate();
                return;
            default:
                int i11 = this.e;
                sn snVar2 = this.f41118g;
                snVar2.f41430wb = i11;
                snVar2.f41444xb = 3;
                snVar2.f41469zb = (String) this.h;
                this.f41117f.invalidate();
                return;
        }
    }
}
