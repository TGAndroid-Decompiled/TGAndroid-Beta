package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xe1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.pl0 {
    public final yf1 f42840a;

    public xe1(yf1 yf1Var) {
        this.f42840a = yf1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f45609a.f(519).d;
        yf1 yf1Var = this.f42840a;
        yf1Var.f43175e1 = i10;
        uf1 uf1Var = yf1Var.f43197r0;
        if (uf1Var != null) {
            uf1Var.setPadding(0, 0, 0, i10);
        }
        of1 of1Var = yf1Var.f43191n;
        if (of1Var != null) {
            of1Var.f39178a.setTranslationY((-yf1Var.f43175e1) - yf1Var.f43172d1);
        }
        yf1Var.h.setTranslationY(((-yf1Var.X0) - yf1Var.f43175e1) - yf1Var.f43172d1);
        yf1Var.B0();
        return r0.l1.f45608b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return yf1.U(this.f42840a, view, f7);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        yf1 yf1Var = this.f42840a;
        yf1Var.U0.i(yf1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return yf1.S(this.f42840a, tL_error);
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }
}
