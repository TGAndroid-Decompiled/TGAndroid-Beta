package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class v81 implements zh.c, org.telegram.messenger.yo, r0.m, org.telegram.ui.Components.jj0 {
    public final u91 f52165a;

    public v81(u91 u91Var) {
        this.f52165a = u91Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i7 = k1Var.f55682a.f(519).d;
        u91 u91Var = this.f52165a;
        u91Var.f51852g1 = i7;
        q91 q91Var = u91Var.f51874s0;
        if (q91Var != null) {
            q91Var.setPadding(0, 0, 0, i7);
        }
        q81 q81Var = u91Var.f51863n;
        if (q81Var != null) {
            ((TextView) q81Var.d).setTranslationY((-u91Var.f51852g1) - u91Var.f51850f1);
        }
        u91Var.h.setTranslationY(((-u91Var.Y0) - u91Var.f51852g1) - u91Var.f51850f1);
        u91Var.F0();
        return r0.k1.f55681b;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        return u91.Z(this.f52165a, tL_error);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        u91 u91Var = this.f52165a;
        u91Var.V0.i(u91Var.S0.b(), z10, z11);
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        return u91.b0(this.f52165a, view, f10);
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }
}
