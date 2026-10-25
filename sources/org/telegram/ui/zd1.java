package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zd1 implements yh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cm0 {
    public final af1 f46267a;

    public zd1(af1 af1Var) {
        this.f46267a = af1Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f47115a.f(519).d;
        af1 af1Var = this.f46267a;
        af1Var.f37746f1 = i10;
        we1 we1Var = af1Var.f37768r0;
        if (we1Var != null) {
            we1Var.setPadding(0, 0, 0, i10);
        }
        qe1 qe1Var = af1Var.f37759n;
        if (qe1Var != null) {
            qe1Var.f42820a.setTranslationY((-af1Var.f37746f1) - af1Var.f37743e1);
        }
        af1Var.h.setTranslationY(((-af1Var.X0) - af1Var.f37746f1) - af1Var.f37743e1);
        af1Var.B0();
        return r0.k1.f47114b;
    }

    @Override
    public void d(boolean z10, boolean z11) {
        af1 af1Var = this.f46267a;
        af1Var.U0.i(af1Var.R0.b(), z10, z11);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        return af1.X(this.f46267a, view, f7);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return af1.V(this.f46267a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }
}
