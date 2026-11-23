package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class sf0 extends mx {
    public final int[] O;
    public final dg0 P;

    public sf0(dg0 dg0Var, rf0 rf0Var, int i7) {
        super(i7, rf0Var);
        this.P = dg0Var;
        this.O = new int[2];
    }

    @Override
    public final void g(lx lxVar) {
        dg0 dg0Var = this.P;
        zf0 zf0Var = dg0Var.K;
        if (lxVar != null) {
            if (dg0Var.f47107l0 != null) {
                lxVar.f49854c = true;
                float f10 = (mx.f() * org.telegram.messenger.g0.f24225p) / 1.3f;
                float f11 = f10 / 3.0f;
                lxVar.d = f11;
                lxVar.f49855e = f11;
                lxVar.f49852a = Utilities.i(dg0Var.f47107l0.right - (0.75f * f10), org.telegram.messenger.g0.f24226q.x - f10, 0.0f);
                lxVar.f49853b = dg0Var.f47107l0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
            if (r1Var != null && r1Var.isAttachedToWindow() && dg0Var.Q.getMessageObject() != null && dg0Var.Q.getMessageObject().e1() == dg0Var.R) {
                org.telegram.ui.Cells.r1 r1Var2 = dg0Var.Q;
                int[] iArr = this.O;
                r1Var2.getLocationOnScreen(iArr);
                lxVar.f49854c = true;
                float f12 = (mx.f() * org.telegram.messenger.g0.f24225p) / 1.3f;
                float f13 = f12 / 3.0f;
                lxVar.d = f13;
                lxVar.f49855e = f13;
                float f14 = f12 / 2.0f;
                lxVar.f49852a = Utilities.i(((zf0Var.getScaleX() * dg0Var.Q.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f24226q.x - f12, 0.0f);
                lxVar.f49853b = ((zf0Var.getScaleY() * dg0Var.Q.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
