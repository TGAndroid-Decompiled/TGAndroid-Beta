package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends of.e {
    public final int d;
    public final int f44712e;
    public final org.telegram.ui.Cells.u1 f44713f;
    public final zn f44714g;
    public final Object h;

    public zi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f44714g = znVar;
        this.f44712e = i10;
        this.h = obj;
        this.f44713f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44712e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44712e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f44712e;
                zn znVar = this.f44714g;
                znVar.f45031wb = i10;
                znVar.f45045xb = 1;
                znVar.f45057yb = (CharacterStyle) this.h;
                this.f44713f.invalidate();
                return;
            default:
                int i11 = this.f44712e;
                zn znVar2 = this.f44714g;
                znVar2.f45031wb = i11;
                znVar2.f45045xb = 3;
                znVar2.f45069zb = (String) this.h;
                this.f44713f.invalidate();
                return;
        }
    }
}
