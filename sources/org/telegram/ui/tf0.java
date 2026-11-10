package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class tf0 extends lx {
    public final int[] N;
    public final eg0 O;

    public tf0(eg0 eg0Var, sf0 sf0Var, int i7) {
        super(i7, sf0Var);
        this.O = eg0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(kx kxVar) {
        eg0 eg0Var = this.O;
        ag0 ag0Var = eg0Var.J;
        if (kxVar != null) {
            if (eg0Var.f45283k0 != null) {
                kxVar.f47442c = true;
                float f10 = (lx.f() * org.telegram.messenger.g0.f22566p) / 1.3f;
                float f11 = f10 / 3.0f;
                kxVar.d = f11;
                kxVar.f47443e = f11;
                kxVar.f47440a = Utilities.i(eg0Var.f45283k0.right - (0.75f * f10), org.telegram.messenger.g0.f22567q.x - f10, 0.0f);
                kxVar.f47441b = eg0Var.f45283k0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
            if (q1Var != null && q1Var.isAttachedToWindow() && eg0Var.P.getMessageObject() != null && eg0Var.P.getMessageObject().e1() == eg0Var.Q) {
                org.telegram.ui.Cells.q1 q1Var2 = eg0Var.P;
                int[] iArr = this.N;
                q1Var2.getLocationOnScreen(iArr);
                kxVar.f47442c = true;
                float f12 = (lx.f() * org.telegram.messenger.g0.f22566p) / 1.3f;
                float f13 = f12 / 3.0f;
                kxVar.d = f13;
                kxVar.f47443e = f13;
                float f14 = f12 / 2.0f;
                kxVar.f47440a = Utilities.i(((ag0Var.getScaleX() * eg0Var.P.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f22567q.x - f12, 0.0f);
                kxVar.f47441b = ((ag0Var.getScaleY() * eg0Var.P.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
