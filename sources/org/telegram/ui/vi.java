package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class vi extends af.f {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f39183f;
    public final xn f39184g;
    public final Object h;

    public vi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f39184g = xnVar;
        this.e = i10;
        this.h = obj;
        this.f39183f = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 18), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.e, 20), 240L);
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
                xn xnVar = this.f39184g;
                xnVar.f40191tb = i10;
                xnVar.f40204ub = 1;
                xnVar.f40217vb = (CharacterStyle) this.h;
                this.f39183f.invalidate();
                return;
            default:
                int i11 = this.e;
                xn xnVar2 = this.f39184g;
                xnVar2.f40191tb = i11;
                xnVar2.f40204ub = 3;
                xnVar2.f40231wb = (String) this.h;
                this.f39183f.invalidate();
                return;
        }
    }
}
