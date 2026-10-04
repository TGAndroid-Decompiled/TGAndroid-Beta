package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends nf.e {
    public final int d;
    public final int f42899e;
    public final org.telegram.ui.Cells.u1 f42900f;
    public final yn f42901g;
    public final Object h;

    public xi(yn ynVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f42901g = ynVar;
        this.f42899e = i10;
        this.h = obj;
        this.f42900f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42899e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42899e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42899e;
                yn ynVar = this.f42901g;
                ynVar.f43518tb = i10;
                ynVar.f43531ub = 1;
                ynVar.f43543vb = (CharacterStyle) this.h;
                this.f42900f.invalidate();
                return;
            default:
                int i11 = this.f42899e;
                yn ynVar2 = this.f42901g;
                ynVar2.f43518tb = i11;
                ynVar2.f43531ub = 3;
                ynVar2.f43557wb = (String) this.h;
                this.f42900f.invalidate();
                return;
        }
    }
}
