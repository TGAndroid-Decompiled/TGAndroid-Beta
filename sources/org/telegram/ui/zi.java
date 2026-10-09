package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends of.e {
    public final int d;
    public final int f44666e;
    public final org.telegram.ui.Cells.u1 f44667f;
    public final zn f44668g;
    public final Object h;

    public zi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f44668g = znVar;
        this.f44666e = i10;
        this.h = obj;
        this.f44667f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44666e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44666e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f44666e;
                zn znVar = this.f44668g;
                znVar.f44985wb = i10;
                znVar.f44999xb = 1;
                znVar.f45011yb = (CharacterStyle) this.h;
                this.f44667f.invalidate();
                return;
            default:
                int i11 = this.f44666e;
                zn znVar2 = this.f44668g;
                znVar2.f44985wb = i11;
                znVar2.f44999xb = 3;
                znVar2.f45023zb = (String) this.h;
                this.f44667f.invalidate();
                return;
        }
    }
}
