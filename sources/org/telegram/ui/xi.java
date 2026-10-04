package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class xi extends nf.e {
    public final int d;
    public final int f42891e;
    public final org.telegram.ui.Cells.u1 f42892f;
    public final yn f42893g;
    public final Object h;

    public xi(yn ynVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f42893g = ynVar;
        this.f42891e = i10;
        this.h = obj;
        this.f42892f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42891e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f42891e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42891e;
                yn ynVar = this.f42893g;
                ynVar.f43510tb = i10;
                ynVar.f43523ub = 1;
                ynVar.f43535vb = (CharacterStyle) this.h;
                this.f42892f.invalidate();
                return;
            default:
                int i11 = this.f42891e;
                yn ynVar2 = this.f42893g;
                ynVar2.f43510tb = i11;
                ynVar2.f43523ub = 3;
                ynVar2.f43549wb = (String) this.h;
                this.f42892f.invalidate();
                return;
        }
    }
}
