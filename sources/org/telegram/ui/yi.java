package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class yi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f39833f;
    public final zn f39834g;
    public final Object h;

    public yi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f39834g = znVar;
        this.e = i10;
        this.h = obj;
        this.f39833f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 24), 240L);
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
                zn znVar = this.f39834g;
                znVar.f40472vb = i10;
                znVar.f40486wb = 1;
                znVar.f40499xb = (CharacterStyle) this.h;
                this.f39833f.invalidate();
                return;
            default:
                int i11 = this.e;
                zn znVar2 = this.f39834g;
                znVar2.f40472vb = i11;
                znVar2.f40486wb = 3;
                znVar2.f40511yb = (String) this.h;
                this.f39833f.invalidate();
                return;
        }
    }
}
