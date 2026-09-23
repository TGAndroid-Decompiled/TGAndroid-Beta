package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f38994f;
    public final xn f38995g;
    public final Object h;

    public wi(xn xnVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f38995g = xnVar;
        this.e = i10;
        this.h = obj;
        this.f38994f = t1Var;
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
                xn xnVar = this.f38995g;
                xnVar.f39580vb = i10;
                xnVar.f39594wb = 1;
                xnVar.f39607xb = (CharacterStyle) this.h;
                this.f38994f.invalidate();
                return;
            default:
                int i11 = this.e;
                xn xnVar2 = this.f38995g;
                xnVar2.f39580vb = i11;
                xnVar2.f39594wb = 3;
                xnVar2.f39619yb = (String) this.h;
                this.f38994f.invalidate();
                return;
        }
    }
}
