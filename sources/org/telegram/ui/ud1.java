package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ud1 implements eh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.pk0 {
    public final we1 f43224a;

    public ud1(we1 we1Var) {
        this.f43224a = we1Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = m1Var.f46929a.f(519).d;
        we1 we1Var = this.f43224a;
        we1Var.f43743a1 = i9;
        re1 re1Var = we1Var.f43768n0;
        if (re1Var != null) {
            re1Var.setPadding(0, 0, 0, i9);
        }
        le1 le1Var = we1Var.f43767n;
        if (le1Var != null) {
            le1Var.f40121a.setTranslationY((-we1Var.f43743a1) - we1Var.Z0);
        }
        we1Var.h.setTranslationY(((-we1Var.T0) - we1Var.f43743a1) - we1Var.Z0);
        we1Var.A0();
        return r0.m1.f46928b;
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        return we1.V(this.f43224a, view, f10);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        we1 we1Var = this.f43224a;
        we1Var.Q0.i(we1Var.N0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return we1.T(this.f43224a, tL_error);
    }

    @Override
    public void j() {
    }

    @Override
    public void u(float f10) {
    }
}
