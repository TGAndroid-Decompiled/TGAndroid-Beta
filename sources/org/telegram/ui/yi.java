package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class yi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f39947f;
    public final zn f39948g;
    public final Object h;

    public yi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f39948g = znVar;
        this.e = i10;
        this.h = obj;
        this.f39947f = u1Var;
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
                zn znVar = this.f39948g;
                znVar.f40514vb = i10;
                znVar.f40528wb = 1;
                znVar.f40541xb = (CharacterStyle) this.h;
                this.f39947f.invalidate();
                return;
            default:
                int i11 = this.e;
                zn znVar2 = this.f39948g;
                znVar2.f40514vb = i11;
                znVar2.f40528wb = 3;
                znVar2.f40553yb = (String) this.h;
                this.f39947f.invalidate();
                return;
        }
    }
}
