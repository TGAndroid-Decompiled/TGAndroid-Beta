package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xe1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.pl0 {
    public final yf1 f42848a;

    public xe1(yf1 yf1Var) {
        this.f42848a = yf1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f45617a.f(519).d;
        yf1 yf1Var = this.f42848a;
        yf1Var.f43183e1 = i10;
        uf1 uf1Var = yf1Var.f43205r0;
        if (uf1Var != null) {
            uf1Var.setPadding(0, 0, 0, i10);
        }
        of1 of1Var = yf1Var.f43199n;
        if (of1Var != null) {
            of1Var.f39184a.setTranslationY((-yf1Var.f43183e1) - yf1Var.f43180d1);
        }
        yf1Var.h.setTranslationY(((-yf1Var.X0) - yf1Var.f43183e1) - yf1Var.f43180d1);
        yf1Var.B0();
        return r0.l1.f45616b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return yf1.U(this.f42848a, view, f7);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        yf1 yf1Var = this.f42848a;
        yf1Var.U0.i(yf1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return yf1.S(this.f42848a, tL_error);
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }
}
