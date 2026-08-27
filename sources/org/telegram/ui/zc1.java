package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

public final class zc1 implements org.telegram.ui.Components.vj0 {

    public final rn f45137a;

    public final MessageObject f45138b;

    public final org.telegram.ui.Components.wj0 f45139c;
    public final dd1 d;

    public zc1(dd1 dd1Var, rn rnVar, MessageObject messageObject, org.telegram.ui.Components.wj0 wj0Var) {
        this.d = dd1Var;
        this.f45137a = rnVar;
        this.f45138b = messageObject;
        this.f45139c = wj0Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        float f10;
        ig.r0 r0Var;
        ig.o0 o0VarL;
        float f11;
        int i10;
        boolean z12;
        float f12;
        int id2 = this.f45138b.getId();
        rn rnVar = this.f45137a;
        org.telegram.ui.Cells.a0 a0VarQ8 = rnVar.q8(id2, true);
        float f13 = 0.0f;
        if (!(a0VarQ8 instanceof org.telegram.ui.Cells.s1)) {
            if (!(a0VarQ8 instanceof org.telegram.ui.Cells.v0) || (o0VarL = (r0Var = ((org.telegram.ui.Cells.v0) a0VarQ8).f25785y0).l(q0Var)) == null) {
                f10 = 0.0f;
            } else {
                f13 = r0Var.f11420c + o0VarL.f11404x + (o0VarL.A / 2.0f);
                f11 = r0Var.d + o0VarL.f11405y;
                i10 = o0VarL.B;
            }
            if (q0Var == null) {
                z12 = z10;
            } else {
                z12 = z10;
            }
            rnVar.ab(a0VarQ8, this.f45138b, this.f45139c, view, f13, f10, q0Var, false, z12, z11, false);
            this.d.c(false);
        }
        ig.r0 r0Var2 = ((org.telegram.ui.Cells.s1) a0VarQ8).J;
        ig.o0 o0VarL2 = r0Var2.l(q0Var);
        if (o0VarL2 != null) {
            f13 = r0Var2.f11420c + o0VarL2.f11404x + (o0VarL2.A / 2.0f);
            f11 = r0Var2.d + o0VarL2.f11405y;
            i10 = o0VarL2.B;
        } else {
            f12 = 0.0f;
        }
        f10 = f12;
        if (q0Var == null && q0Var.f11408a) {
            z12 = true;
        } else {
            z12 = z10;
        }
        rnVar.ab(a0VarQ8, this.f45138b, this.f45139c, view, f13, f10, q0Var, false, z12, z11, false);
        this.d.c(false);
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        if (q0Var == null) {
            z12 = z10;
        } else {
            z12 = z10;
        }
        rnVar.ab(a0VarQ8, this.f45138b, this.f45139c, view, f13, f10, q0Var, false, z12, z11, false);
        this.d.c(false);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
