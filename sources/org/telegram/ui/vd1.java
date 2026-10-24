package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cm0 {
    public final xe1 f42707a;

    public vd1(xe1 xe1Var) {
        this.f42707a = xe1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f45250a.f(519).d;
        xe1 xe1Var = this.f42707a;
        xe1Var.f43560f1 = i10;
        se1 se1Var = xe1Var.f43582r0;
        if (se1Var != null) {
            se1Var.setPadding(0, 0, 0, i10);
        }
        me1 me1Var = xe1Var.f43573n;
        if (me1Var != null) {
            me1Var.f39576a.setTranslationY((-xe1Var.f43560f1) - xe1Var.f43557e1);
        }
        xe1Var.h.setTranslationY(((-xe1Var.X0) - xe1Var.f43560f1) - xe1Var.f43557e1);
        xe1Var.A0();
        return r0.k1.f45249b;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        return xe1.W(this.f42707a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        xe1 xe1Var = this.f42707a;
        xe1Var.U0.i(xe1Var.R0.b(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return xe1.U(this.f42707a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }
}
