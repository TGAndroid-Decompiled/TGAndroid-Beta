package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class y81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final w91 f52170a;

    public y81(w91 w91Var) {
        this.f52170a = w91Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.f54201a.f(519).d;
        w91 w91Var = this.f52170a;
        w91Var.f51008f1 = i7;
        s91 s91Var = w91Var.f51029r0;
        if (s91Var != null) {
            s91Var.setPadding(0, 0, 0, i7);
        }
        t81 t81Var = w91Var.f51021n;
        if (t81Var != null) {
            ((TextView) t81Var.d).setTranslationY((-w91Var.f51008f1) - w91Var.f51005e1);
        }
        w91Var.h.setTranslationY(((-w91Var.X0) - w91Var.f51008f1) - w91Var.f51005e1);
        w91Var.F0();
        return r0.k1.f54200b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return w91.Z(this.f52170a, tL_error);
    }

    @Override
    public void d(boolean z9, boolean z10) {
        w91 w91Var = this.f52170a;
        w91Var.U0.i(w91Var.R0.b(), z9, z10);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        return w91.b0(this.f52170a, view, f10);
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }
}
