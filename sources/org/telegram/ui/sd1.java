package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.zl0 {
    public final te1 f41084a;

    public sd1(te1 te1Var) {
        this.f41084a = te1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f44853a.f(519).d;
        te1 te1Var = this.f41084a;
        te1Var.f41691e1 = i10;
        pe1 pe1Var = te1Var.f41713r0;
        if (pe1Var != null) {
            pe1Var.setPadding(0, 0, 0, i10);
        }
        je1 je1Var = te1Var.f41707n;
        if (je1Var != null) {
            je1Var.f38128a.setTranslationY((-te1Var.f41691e1) - te1Var.f41689d1);
        }
        te1Var.h.setTranslationY(((-te1Var.X0) - te1Var.f41691e1) - te1Var.f41689d1);
        te1Var.B0();
        return r0.k1.f44852b;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        return te1.W(this.f41084a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        te1 te1Var = this.f41084a;
        te1Var.U0.i(te1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return te1.U(this.f41084a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }
}
