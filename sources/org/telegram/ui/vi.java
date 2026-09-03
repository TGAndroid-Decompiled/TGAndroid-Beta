package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class vi extends af.f {
    public final int d;
    public final int f42147e;
    public final org.telegram.ui.Cells.t1 f42148f;
    public final xn f42149g;
    public final Object h;

    public vi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f42149g = xnVar;
        this.f42147e = i10;
        this.h = obj;
        this.f42148f = t1Var;
    }

    @Override
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42147e, 18), 240L);
                    return;
                }
                return;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new af.b(this, this.f42147e, 20), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f42147e;
                xn xnVar = this.f42149g;
                xnVar.f43338tb = i10;
                xnVar.f43351ub = 1;
                xnVar.f43364vb = (CharacterStyle) this.h;
                this.f42148f.invalidate();
                return;
            default:
                int i11 = this.f42147e;
                xn xnVar2 = this.f42149g;
                xnVar2.f43338tb = i11;
                xnVar2.f43351ub = 3;
                xnVar2.f43378wb = (String) this.h;
                this.f42148f.invalidate();
                return;
        }
    }
}
