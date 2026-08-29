package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wd1 implements hh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.cl0 {
    public final ze1 f43953a;

    public wd1(ze1 ze1Var) {
        this.f43953a = ze1Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46843a.f(519).d;
        ze1 ze1Var = this.f43953a;
        ze1Var.f45157a1 = i10;
        ve1 ve1Var = ze1Var.f45182n0;
        if (ve1Var != null) {
            ve1Var.setPadding(0, 0, 0, i10);
        }
        oe1 oe1Var = ze1Var.f45181n;
        if (oe1Var != null) {
            oe1Var.f41104a.setTranslationY((-ze1Var.f45157a1) - ze1Var.Z0);
        }
        ze1Var.h.setTranslationY(((-ze1Var.T0) - ze1Var.f45157a1) - ze1Var.Z0);
        ze1Var.B0();
        return r0.m1.f46842b;
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        return ze1.W(this.f43953a, view, f9);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        ze1 ze1Var = this.f43953a;
        ze1Var.Q0.i(ze1Var.N0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ze1.U(this.f43953a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void r(float f9) {
    }
}
