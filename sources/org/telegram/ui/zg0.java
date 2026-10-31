package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class zg0 extends ly {
    public final int[] N;
    public final kh0 O;

    public zg0(kh0 kh0Var, yg0 yg0Var, int i10) {
        super(i10, yg0Var);
        this.O = kh0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(ky kyVar) {
        kh0 kh0Var = this.O;
        gh0 gh0Var = kh0Var.J;
        if (kyVar != null) {
            if (kh0Var.f38842k0 != null) {
                kyVar.f38974c = true;
                float f7 = (ly.f() * org.telegram.messenger.i0.f16025p) / 1.3f;
                float f10 = f7 / 3.0f;
                kyVar.d = f10;
                kyVar.e = f10;
                kyVar.f38972a = Utilities.i(kh0Var.f38842k0.right - (0.75f * f7), org.telegram.messenger.i0.f16026q.x - f7, 0.0f);
                kyVar.f38973b = kh0Var.f38842k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
            if (q1Var != null && q1Var.isAttachedToWindow() && kh0Var.P.getMessageObject() != null && kh0Var.P.getMessageObject().f1() == kh0Var.Q) {
                org.telegram.ui.Cells.q1 q1Var2 = kh0Var.P;
                int[] iArr = this.N;
                q1Var2.getLocationOnScreen(iArr);
                kyVar.f38974c = true;
                float f11 = (ly.f() * org.telegram.messenger.i0.f16025p) / 1.3f;
                float f12 = f11 / 3.0f;
                kyVar.d = f12;
                kyVar.e = f12;
                float f13 = f11 / 2.0f;
                kyVar.f38972a = Utilities.i(((gh0Var.getScaleX() * kh0Var.P.getTimeX()) + iArr[0]) - f13, org.telegram.messenger.i0.f16026q.x - f11, 0.0f);
                kyVar.f38973b = ((gh0Var.getScaleY() * kh0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
