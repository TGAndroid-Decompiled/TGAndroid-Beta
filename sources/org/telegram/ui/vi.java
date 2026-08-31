package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class vi extends af.f {
    public final int d;
    public final int f42239e;
    public final org.telegram.ui.Cells.t1 f42240f;
    public final xn f42241g;
    public final Object h;

    public vi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f42241g = xnVar;
        this.f42239e = i10;
        this.h = obj;
        this.f42240f = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42239e, 18), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42239e, 20), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42239e;
                xn xnVar = this.f42241g;
                xnVar.f43360tb = i10;
                xnVar.f43373ub = 1;
                xnVar.f43386vb = (CharacterStyle) this.h;
                this.f42240f.invalidate();
                return;
            default:
                int i11 = this.f42239e;
                xn xnVar2 = this.f42241g;
                xnVar2.f43360tb = i11;
                xnVar2.f43373ub = 3;
                xnVar2.f43400wb = (String) this.h;
                this.f42240f.invalidate();
                return;
        }
    }
}
