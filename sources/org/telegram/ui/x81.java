package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class x81 implements yh.c, org.telegram.messenger.bp, r0.m, org.telegram.ui.Components.ej0 {
    public final v91 f51800a;

    public x81(v91 v91Var) {
        this.f51800a = v91Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int i7 = k1Var.f54108a.f(519).d;
        v91 v91Var = this.f51800a;
        v91Var.f50644f1 = i7;
        r91 r91Var = v91Var.f50665r0;
        if (r91Var != null) {
            r91Var.setPadding(0, 0, 0, i7);
        }
        s81 s81Var = v91Var.f50657n;
        if (s81Var != null) {
            ((TextView) s81Var.d).setTranslationY((-v91Var.f50644f1) - v91Var.f50641e1);
        }
        v91Var.h.setTranslationY(((-v91Var.X0) - v91Var.f50644f1) - v91Var.f50641e1);
        v91Var.F0();
        return r0.k1.f54107b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return v91.Z(this.f51800a, tL_error);
    }

    @Override
    public void d(boolean z9, boolean z10) {
        v91 v91Var = this.f51800a;
        v91Var.U0.i(v91Var.R0.b(), z9, z10);
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        return v91.b0(this.f51800a, view, f10);
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }
}
