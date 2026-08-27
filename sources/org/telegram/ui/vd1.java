package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class vd1 implements fh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.sk0 {

    public final we1 f43433a;

    public vd1(we1 we1Var) {
        this.f43433a = we1Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46619a.f(519).d;
        we1 we1Var = this.f43433a;
        we1Var.f43721a1 = i10;
        se1 se1Var = we1Var.f43746n0;
        if (se1Var != null) {
            se1Var.setPadding(0, 0, 0, i10);
        }
        me1 me1Var = we1Var.f43745n;
        if (me1Var != null) {
            me1Var.f40465a.setTranslationY((-we1Var.f43721a1) - we1Var.Z0);
        }
        we1Var.h.setTranslationY(((-we1Var.T0) - we1Var.f43721a1) - we1Var.Z0);
        we1Var.B0();
        return r0.m1.f46618b;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        return we1.W(this.f43433a, view, f10);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        we1 we1Var = this.f43433a;
        we1Var.Q0.i(we1Var.N0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return we1.U(this.f43433a, tL_error);
    }

    @Override
    public void i() {
    }

    @Override
    public void s(float f10) {
    }
}
