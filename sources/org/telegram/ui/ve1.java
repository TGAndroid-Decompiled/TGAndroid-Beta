package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ve1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.nl0 {
    public final wf1 f38704a;

    public ve1(wf1 wf1Var) {
        this.f38704a = wf1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f42140a.f(519).d;
        wf1 wf1Var = this.f38704a;
        wf1Var.f39320e1 = i10;
        sf1 sf1Var = wf1Var.f39342r0;
        if (sf1Var != null) {
            sf1Var.setPadding(0, 0, 0, i10);
        }
        mf1 mf1Var = wf1Var.f39336n;
        if (mf1Var != null) {
            mf1Var.f35552a.setTranslationY((-wf1Var.f39320e1) - wf1Var.f39318d1);
        }
        wf1Var.h.setTranslationY(((-wf1Var.X0) - wf1Var.f39320e1) - wf1Var.f39318d1);
        wf1Var.B0();
        return r0.l1.f42139b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return wf1.W(this.f38704a, view, f7);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        wf1 wf1Var = this.f38704a;
        wf1Var.U0.i(wf1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return wf1.U(this.f38704a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }
}
