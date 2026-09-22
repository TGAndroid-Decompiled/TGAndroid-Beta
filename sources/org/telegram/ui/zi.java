package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40243f;
    public final zn f40244g;
    public final Object h;

    public zi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40244g = znVar;
        this.e = i10;
        this.h = obj;
        this.f40243f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 22), 240L);
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
                zn znVar = this.f40244g;
                znVar.f40535vb = i10;
                znVar.f40549wb = 1;
                znVar.f40562xb = (CharacterStyle) this.h;
                this.f40243f.invalidate();
                return;
            default:
                int i11 = this.e;
                zn znVar2 = this.f40244g;
                znVar2.f40535vb = i11;
                znVar2.f40549wb = 3;
                znVar2.f40574yb = (String) this.h;
                this.f40243f.invalidate();
                return;
        }
    }
}
