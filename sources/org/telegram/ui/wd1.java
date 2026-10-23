package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final ye1 f43013a;

    public wd1(ye1 ye1Var) {
        this.f43013a = ye1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f45251a.f(519).d;
        ye1 ye1Var = this.f43013a;
        ye1Var.f43807f1 = i10;
        te1 te1Var = ye1Var.f43829r0;
        if (te1Var != null) {
            te1Var.setPadding(0, 0, 0, i10);
        }
        ne1 ne1Var = ye1Var.f43820n;
        if (ne1Var != null) {
            ne1Var.f39858a.setTranslationY((-ye1Var.f43807f1) - ye1Var.f43804e1);
        }
        ye1Var.h.setTranslationY(((-ye1Var.X0) - ye1Var.f43807f1) - ye1Var.f43804e1);
        ye1Var.A0();
        return r0.k1.f45250b;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        return ye1.W(this.f43013a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        ye1 ye1Var = this.f43013a;
        ye1Var.U0.i(ye1Var.R0.b(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ye1.U(this.f43013a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }
}
