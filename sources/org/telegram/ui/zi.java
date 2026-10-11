package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends of.e {
    public final int d;
    public final int f44707e;
    public final org.telegram.ui.Cells.u1 f44708f;
    public final zn f44709g;
    public final Object h;

    public zi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f44709g = znVar;
        this.f44707e = i10;
        this.h = obj;
        this.f44708f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44707e, 19), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f44707e, 22), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f44707e;
                zn znVar = this.f44709g;
                znVar.f45020wb = i10;
                znVar.f45034xb = 1;
                znVar.f45046yb = (CharacterStyle) this.h;
                this.f44708f.invalidate();
                return;
            default:
                int i11 = this.f44707e;
                zn znVar2 = this.f44709g;
                znVar2.f45020wb = i11;
                znVar2.f45034xb = 3;
                znVar2.f45058zb = (String) this.h;
                this.f44708f.invalidate();
                return;
        }
    }
}
