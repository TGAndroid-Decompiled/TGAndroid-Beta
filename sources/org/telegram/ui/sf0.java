package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class sf0 extends kx {
    public final int[] N;
    public final dg0 O;

    public sf0(dg0 dg0Var, rf0 rf0Var, int i7) {
        super(i7, rf0Var);
        this.O = dg0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(jx jxVar) {
        dg0 dg0Var = this.O;
        zf0 zf0Var = dg0Var.J;
        if (jxVar != null) {
            if (dg0Var.f44962k0 != null) {
                jxVar.f47108c = true;
                float f10 = (kx.f() * org.telegram.messenger.g0.f22562p) / 1.3f;
                float f11 = f10 / 3.0f;
                jxVar.d = f11;
                jxVar.f47109e = f11;
                jxVar.f47106a = Utilities.i(dg0Var.f44962k0.right - (0.75f * f10), org.telegram.messenger.g0.f22563q.x - f10, 0.0f);
                jxVar.f47107b = dg0Var.f44962k0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = dg0Var.P;
            if (q1Var != null && q1Var.isAttachedToWindow() && dg0Var.P.getMessageObject() != null && dg0Var.P.getMessageObject().e1() == dg0Var.Q) {
                org.telegram.ui.Cells.q1 q1Var2 = dg0Var.P;
                int[] iArr = this.N;
                q1Var2.getLocationOnScreen(iArr);
                jxVar.f47108c = true;
                float f12 = (kx.f() * org.telegram.messenger.g0.f22562p) / 1.3f;
                float f13 = f12 / 3.0f;
                jxVar.d = f13;
                jxVar.f47109e = f13;
                float f14 = f12 / 2.0f;
                jxVar.f47106a = Utilities.i(((zf0Var.getScaleX() * dg0Var.P.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f22563q.x - f12, 0.0f);
                jxVar.f47107b = ((zf0Var.getScaleY() * dg0Var.P.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
