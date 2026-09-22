package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class zi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f40211f;
    public final bo f40212g;
    public final Object h;

    public zi(bo boVar, int i10, Object obj, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f40212g = boVar;
        this.e = i10;
        this.h = obj;
        this.f40211f = t1Var;
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
                bo boVar = this.f40212g;
                boVar.f32503vb = i10;
                boVar.f32517wb = 1;
                boVar.f32530xb = (CharacterStyle) this.h;
                this.f40211f.invalidate();
                return;
            default:
                int i11 = this.e;
                bo boVar2 = this.f40212g;
                boVar2.f32503vb = i11;
                boVar2.f32517wb = 3;
                boVar2.f32542yb = (String) this.h;
                this.f40211f.invalidate();
                return;
        }
    }
}
