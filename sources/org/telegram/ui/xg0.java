package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class xg0 extends ky {
    public final int[] N;
    public final ih0 O;

    public xg0(ih0 ih0Var, wg0 wg0Var, int i10) {
        super(i10, wg0Var);
        this.O = ih0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(jy jyVar) {
        ih0 ih0Var = this.O;
        eh0 eh0Var = ih0Var.J;
        if (jyVar != null) {
            if (ih0Var.f38072k0 != null) {
                jyVar.f38580c = true;
                float f7 = (ky.f() * org.telegram.messenger.i0.f16171p) / 1.3f;
                float f10 = f7 / 3.0f;
                jyVar.d = f10;
                jyVar.e = f10;
                jyVar.f38578a = Utilities.i(ih0Var.f38072k0.right - (0.75f * f7), org.telegram.messenger.i0.f16172q.x - f7, 0.0f);
                jyVar.f38579b = ih0Var.f38072k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
            if (q1Var != null && q1Var.isAttachedToWindow() && ih0Var.P.getMessageObject() != null && ih0Var.P.getMessageObject().f1() == ih0Var.Q) {
                org.telegram.ui.Cells.q1 q1Var2 = ih0Var.P;
                int[] iArr = this.N;
                q1Var2.getLocationOnScreen(iArr);
                jyVar.f38580c = true;
                float f11 = (ky.f() * org.telegram.messenger.i0.f16171p) / 1.3f;
                float f12 = f11 / 3.0f;
                jyVar.d = f12;
                jyVar.e = f12;
                float f13 = f11 / 2.0f;
                jyVar.f38578a = Utilities.i(((eh0Var.getScaleX() * ih0Var.P.getTimeX()) + iArr[0]) - f13, org.telegram.messenger.i0.f16172q.x - f11, 0.0f);
                jyVar.f38579b = ((eh0Var.getScaleY() * ih0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
