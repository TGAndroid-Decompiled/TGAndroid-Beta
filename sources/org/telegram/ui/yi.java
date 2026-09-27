package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class yi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40219f;
    public final xn f40220g;
    public final Object h;

    public yi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40220g = xnVar;
        this.e = i10;
        this.h = obj;
        this.f40219f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 20), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.e, 22), 240L);
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
                xn xnVar = this.f40220g;
                xnVar.f39961vb = i10;
                xnVar.f39975wb = 1;
                xnVar.f39988xb = (CharacterStyle) this.h;
                this.f40219f.invalidate();
                return;
            default:
                int i11 = this.e;
                xn xnVar2 = this.f40220g;
                xnVar2.f39961vb = i11;
                xnVar2.f39975wb = 3;
                xnVar2.f40000yb = (String) this.h;
                this.f40219f.invalidate();
                return;
        }
    }
}
