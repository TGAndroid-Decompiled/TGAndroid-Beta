package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class re1 implements kh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ll0 {
    public final sf1 f40831a;

    public re1(sf1 sf1Var) {
        this.f40831a = sf1Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46483a.f(519).d;
        sf1 sf1Var = this.f40831a;
        sf1Var.f41193b1 = i10;
        of1 of1Var = sf1Var.f41217o0;
        if (of1Var != null) {
            of1Var.setPadding(0, 0, 0, i10);
        }
        if1 if1Var = sf1Var.f41215n;
        if (if1Var != null) {
            if1Var.f37651a.setTranslationY((-sf1Var.f41193b1) - sf1Var.f41190a1);
        }
        sf1Var.h.setTranslationY(((-sf1Var.U0) - sf1Var.f41193b1) - sf1Var.f41190a1);
        sf1Var.B0();
        return r0.m1.f46482b;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        return sf1.W(this.f40831a, view, f10);
    }

    @Override
    public void g(boolean z4, boolean z10) {
        sf1 sf1Var = this.f40831a;
        sf1Var.R0.i(sf1Var.O0.c(), z4, z10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return sf1.U(this.f40831a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }
}
