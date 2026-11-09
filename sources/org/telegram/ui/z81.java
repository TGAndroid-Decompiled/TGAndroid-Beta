package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class z81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.fj0 {
    public final y91 f52472a;

    public z81(y91 y91Var) {
        this.f52472a = y91Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.f54214a.f(519).d;
        y91 y91Var = this.f52472a;
        y91Var.f52029f1 = i7;
        u91 u91Var = y91Var.f52050r0;
        if (u91Var != null) {
            u91Var.setPadding(0, 0, 0, i7);
        }
        u81 u81Var = y91Var.f52042n;
        if (u81Var != null) {
            ((TextView) u81Var.d).setTranslationY((-y91Var.f52029f1) - y91Var.f52026e1);
        }
        y91Var.h.setTranslationY(((-y91Var.X0) - y91Var.f52029f1) - y91Var.f52026e1);
        y91Var.F0();
        return r0.k1.f54213b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return y91.Z(this.f52472a, tL_error);
    }

    @Override
    public void d(boolean z9, boolean z10) {
        y91 y91Var = this.f52472a;
        y91Var.U0.i(y91Var.R0.b(), z9, z10);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        return y91.b0(this.f52472a, view, f10);
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }
}
